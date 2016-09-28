package com.data.structure.visiulation;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class DisplayBinaryTree extends JFrame {
  JScrollPane scrollpane;
  DisplayPanel panel;
  

  public DisplayBinaryTree(MyTree t) {
    panel = new DisplayPanel(t);
    panel.setPreferredSize(new Dimension(300, 300));
    scrollpane = new JScrollPane(panel);
    getContentPane().add(scrollpane, BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    pack();  // cleans up the window panel
  }

  public static void main(String[] args) {

    MyTree t = new MyTree(); // t is Binary tree we are displaying
    BufferedReader diskInput;
    String word;
    // read in the words to create the Binary Search Tree
    if(args.length!=1){
	System.out.println("usage: java DisplayTree textfile");
        System.exit(0);
    }
    try { //reads in words from a file
      diskInput = new BufferedReader(new InputStreamReader(
          new FileInputStream(
	      new File(args[0]))));// file name is on command line
      Scanner input=new Scanner(diskInput);
      while (input.hasNext()) { 
        word=input.next();
        word=word.toLowerCase(); // use lower case only
        t.root = t.insert(t.root, word);  //insert word into Binary Search Tree
        t.inputString= t.inputString + " " + word; // add word to input string
      }
    }
    catch (IOException e) {
        System.out.println("io exception");
      }

    t.computeNodePositions(); //finds x,y positions of the tree nodes
    t.maxheight=t.treeHeight(t.root); //finds tree height for scaling y axis
    DisplayBinaryTree dt = new DisplayBinaryTree(t);//get a display panel
    dt.setVisible(true); //show the display
  }
}

  class DisplayPanel extends JPanel {
   private  MyTree t;
   private   final  int  X_S = 10;
   private    int ys;

    public DisplayPanel(MyTree t) {
      this.t = t; // allows dispay routines to access the tree
      setBackground(Color.white);
      setForeground(Color.black);
    }

    protected void paintComponent(Graphics g) {
      g.setColor(getBackground()); //colors the window
      g.fillRect(0, 0, getWidth(), getHeight());
      g.setColor(getForeground()); //set color and fonts
      Font MyFont = new Font("SansSerif",Font.PLAIN,10);
      g.setFont(MyFont);
      //xs=10;   //where to start printing on the panel
      ys=20;
      g.drawString("Binary Search tree for the input string:\n",X_S,ys);
      ys=ys+10;;
      int start=0;
      //  print input string on panel, 150 chars per line
      // if string longer than 23 lines don't print
      if(t.inputString.length()<23*150){
           while((t.inputString.length()-start)>150){
              g.drawString(t.inputString.substring(start,start+150),X_S,ys);        
              start+=151;
              ys+=15;
           }
           g.drawString(t.inputString.substring(start,t.inputString.length()),X_S,ys);
      }
      MyFont = new Font("SansSerif",Font.BOLD,20); //bigger font for tree
      g.setFont(MyFont);
      this.drawTree(g, t.root); // draw the tree
      revalidate(); //update the component panel
    }

      public void drawTree(Graphics g, Node root) {//actually draws the tree
      int dx, dy, dx2, dy2;
      int SCREEN_WIDTH=800; //screen size for panel
      int SCREEN_HEIGHT=700;
      int XSCALE, YSCALE;  
      XSCALE=SCREEN_WIDTH/t.totalnodes; //scale x by total nodes in tree
      YSCALE=(SCREEN_HEIGHT-ys)/(t.maxheight+1); //scale y by tree height

      if (root != null) { // inorder traversal to draw each node
        drawTree(g, root.getLeft()); // do left side of inorder traversal 
        dx = root.getXpos() * XSCALE; // get x,y coords., and scale them 
        dy = root.getYpos() * YSCALE +ys;
        String s = (String) root.getData(); //get the word at this node
        g.drawString(s, dx, dy); // draws the word
// this draws the lines from a node to its children, if any
        if(root.getLeft()!=null){ //draws the line to left child if it exists
          dx2 = root.getLeft().getXpos() * XSCALE; 
          dy2 = root.getLeft().getYpos() * YSCALE +ys;
          g.drawLine(dx,dy,dx2,dy2);
        }
        if(root.getRight()!=null){ //draws the line to right child if it exists
          dx2 = root.getRight().getXpos() * XSCALE;//get right child x,y scaled position
          dy2 = root.getRight().getYpos() * YSCALE + ys;
          g.drawLine(dx,dy,dx2,dy2);
        }
        drawTree(g, root.getRight()); //now do right side of inorder traversal 
      }
    }

	public MyTree getT() {
		return t;
	}

	public void setT(MyTree t) {
		this.t = t;
	}

	public int getYs() {
		return ys;
	}

	public void setYs(int ys) {
		this.ys = ys;
	}

	public int getX_S() {
		return X_S;
	}
      
      
}

  class MyTree {
    String inputString= new String();
    Node root;
    int totalnodes = 0; //keeps track of the inorder number for horiz. scaling 
    int maxheight=0;//keeps track of the depth of the tree for vert. scaling

    MyTree() {
      root = null;
    }

    public int treeHeight(Node t){
	if(t==null) return -1;
          else return 1 + max(treeHeight(t.getLeft()),treeHeight(t.getRight()));
    }
    public int max(int a, int b){
	  if(a>b) return a; else return b;
    }

    public void computeNodePositions() {
      int depth = 1;
      inorder_traversal(root, depth);
    }

//traverses tree and computes x,y position of each node, stores it in the node

    public void inorder_traversal(Node t, int depth) { 
      if (t != null) {
        inorder_traversal(t.getLeft(), depth + 1); //add 1 to depth (y coordinate) 
        t.setXpos(totalnodes++); //x coord is node number in inorder traversal
        t.setXpos(depth); // mark y coord as depth
        inorder_traversal(t.getRight(), depth + 1);
      }
}

/* below is standard Binary Search tree insert code, creates the tree */

    public Node insert(Node root, String s) { // Binary Search tree insert
      if (root == null) {
        root = new Node(s, null, null);
        return root;
      }
      else {
        if (s.compareTo((String)(root.getData())) == 0) {
           return root;  /* duplicate word  found - do nothing */
        } else   if (s.compareTo((String)(root.getData())) < 0)
                     root.setLeft(insert(root.getLeft(), s));
                 else
                     root.setRight(insert(root.getRight(), s));
        return root;
      }
    }
  }

class Node {  //standard Binary Tree node
   private Object data;
   private  Node left;
   private Node right;
   private   int xpos;  //stores x and y position of the node in the tree
   private  int ypos;  

    Node(String x, Node l, Node r) {
      left = l;
      right = r;
      data = (Object) x;
    }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
    
    
  }