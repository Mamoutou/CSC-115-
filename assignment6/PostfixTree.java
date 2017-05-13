package assignment6;

/*
Write a program that takes an expression and
produces a binary expression tree. You can assume
that you have only binary operators and that the
postfix expression is given as a list.

*/

import java.util.Stack;

public class PostfixTree {

	private Node root;
        private Node right;
        private Node left;
	private final String operator = "+-*/";
        char scanchar;

	public PostfixTree() {
		root = null;
                left = root;
                right = root;
                
	}
	
        
	public void inOrderTraversal() {
		inOrder(root);
	}

	private void inOrder(Node node) {		
	     
		if (node != null) {                                       
                                                  			
		    inOrder(node.left);
		    System.out.print(node.getData() + " ");
		    inOrder(node.right);
		}
    }
		                         

	public void postOrderTraversal() {
		postOrder(root);
	}

	private void postOrder (Node node) {
          
		if (node!=null) {
	   	    postOrder(node.left);
	   	    postOrder(node.right);
	        System.out.print(node.getData() + "");

		}
	}


	public void preOrderTraversal() {
		preOrder(root);
	}

	private void preOrder (Node node) {
              
		  if (node != null)  {
		   	   System.out.print(node.getData() + "");
		   	   preOrder(node.left);
		   	   preOrder(node.right);
		  }
	          
	}

	 public PostfixTree(char[] data) {
		 
		      Stack stack = new Stack();
		      Node newNode;
		      for (int i=0; i<data.length; ++i) {
		    	 
		          if (data[i] >= '0' && data[i] <= '9' || data[i] >= 'A'
		                  && data[i] <= 'Z' || data[i] >= 'a' && data[i] <= 'z')  {
		        	  
		                  newNode = new Node(data[i]);
		                  stack.push(newNode);
		          } 
		          else if (data[i] == '+' || data[i] == '-' || data[i] == '/' || data[i] == '*') {
		              Node ptr1 =(Node) stack.pop();
		              Node ptr2 = (Node)stack.pop();
		              newNode = new Node(data[i]);
		              newNode.left = ptr2;
		              newNode.right = ptr1;
		              stack.push(newNode);
		          }
		      }
		      root =( Node)stack.pop();
	  }

}

