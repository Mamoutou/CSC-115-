package assignment6;

	/**
	 *
	 * @author saryta
	 */
	public class Main {

	    public static void main(String[] args) {
	        PostfixTree tree = new PostfixTree();

	        char[] expression1 = {'a', 'b','+'};
	        char expression2[] = {'a', 'b', '*', 'c', '+'};
	        char expression3[] = { 'a', 'b', '-', 'c', '*' , 'd', 'e', 'f', '-','+',  'g', '/', '+'};

	        try {

	            tree = new PostfixTree(expression1);

	            System.out.println("a b  +: ");

	            System.out.print("\tinorder: ");
	            tree.inOrderTraversal();

	            System.out.print("\n\tpreorder: ");
	            tree.preOrderTraversal();

	            System.out.print("\n\tpostorder: ");
	            tree.postOrderTraversal();

	            System.out.println();
	            System.out.println();

	            tree = new PostfixTree(expression2);
	            System.out.println("a  b * c +: ");

	            System.out.print("\tinorder: ");
	            tree.inOrderTraversal();

	            System.out.print("\n\tpreorder: ");
	            tree.preOrderTraversal();

	            System.out.print("\n\tpostorder: ");
	            tree.postOrderTraversal();

	            System.out.println();
	            System.out.println();


	            tree = new PostfixTree(expression3);
	            System.out.println("a  b - c * d e f - + g / +: ");

	            System.out.print("\tinorder: ");
	            tree.inOrderTraversal();

	            System.out.print("\n\tpreorder: ");
	            tree.preOrderTraversal();

	            System.out.print("\n\tpostorder: ");
	            tree.postOrderTraversal();

	            System.out.println();
	            System.out.println();
	            
	        } catch (Exception e1) {

	            e1.printStackTrace();
	        }
	    }
	}

	/*
	a b  +:
 inorder: a + b
 preorder: + a b
 postorder: a b +

 a  b * c +:
 inorder: a * b + c
 preorder: + * a b c
 postorder: a b * c +

 a  b - c * d e f - + g / +:
 inorder: a - b * c + d + e - f / g
 preorder: + * - a b c / + d - e f g
 postorder: a b - c * d e f - + g / +



	 */
