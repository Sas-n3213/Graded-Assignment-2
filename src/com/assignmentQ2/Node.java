package com.assignmentQ2;
// Class of the Node
public class Node {                            
	int val ;
	Node left , right;
	

//Helper function that allocates a new node with given data and Null left and right pointer
	
Node (int Data)
{
	val = Data;
	left=right=null;
}
 }

  class Skewedtree {
	  
	  
                  public static Node node;
                  static Node prevNode=null;
                  static Node headNode=null;
// Function to convert the BST to Skewed Tree in Increasing order

public static void skewedTree  (Node root , int order)
{
	
	//Base Case
	if (root==null)
	{
		return;
	}
	
	//Condition to check the order  
	if (order>0)
	{
		skewedTree (root.right,order);
		
	}
	
	else 
	{
		skewedTree (root.left,order);
	}
	
	Node rightNode = root.right;
	Node leftNode = root.left;
	
	//Condition to check if the root Node of the Skewed Tree is not defined
	
	if (headNode == null)
	{
		headNode = root;
		root.left=null;
		prevNode = root;
		
	}
	else
	{
		prevNode.right = root;
		root.left = null;
		prevNode = root;
	}
	//Similarly recurse for the left/right subtree on the basis of order required
	
	if (order>0)
	{
		skewedTree (leftNode,order);
	}
	else 
	{
		skewedTree (rightNode,order);
	}
}

//Function to Traverse the right skewed tree using Recursion
static void transverseRightSkewed (Node root)
{
 if (root==null)
 {
	 return;
 }
 System.out.print(root.val    + "   ");

 
 transverseRightSkewed (root.right);

}

//Driver code
public static void main (String[] args)
{
	Skewedtree tree = new Skewedtree ();
 tree.node = new Node(50);
 tree.node.left = new  Node(30);
 tree.node.right = new Node(60);
 tree.node.left.left = new Node(10);
 tree.node.right.left = new Node (55);
 
 int order = 0;
 skewedTree ( node ,order);
 transverseRightSkewed (headNode);
}
}
