package Assignment4;

/**
 * @author: Mamoutou Sangare
 * @subject: comp139
 * @Lab: 4
 * @purpose:  Driver program to test the conversion of infix expressions to
 *            postfix expressions and then evaluate the postfix expression
 * StackTest.java
 */

public class StackTest 
{

	public static final int MAX_ITEMS = 10;

	public static void main(String[] args)
	{

		String testString ;  // balanced
		String testString1 = "(()()())";  // balanced
		String testString2 = "(()))";	// unbalanced
		String testString3 = "(a + b ( c ))"; //balanced
		String testString4 = "(a + b ( c )))";	//unbalanced
		String testString5 = "4 2 + ";
		String testString6 = "14 + 2 ";
		String testString7 = "14 + 2 * 6 - 5";
		String testString8 = "2 * (13 - 3) / 6";
		


		LinkedStack stack = new LinkedStack();
		Parenthesis p = new Parenthesis();
		PostFix pf= new PostFix();
		InfixToPostfix infix = new InfixToPostfix();

		try {


			System.out.println("1: Parenthesis matching");
			System.out.println("Original expression " + testString1);
			System.out.println("matching parenthesis: " + p.match(testString1));
			System.out.println();

			System.out.println("2: Parenthesis matching");
			System.out.println("Original expression " + testString2);
			System.out.println("matching parenthesis: " + p.match(testString2)); 
			System.out.println();

			System.out.println("3: Parenthesis matching");
			System.out.println("Original expression " + testString3);
			System.out.println("matching parenthesis: " + p.match(testString3));  
			System.out.println();

			System.out.println("4: Parenthesis matching");
			System.out.println("Original expression " + testString4);
			System.out.println("matching parenthesis: " + p.match(testString4));   
			System.out.println();

			System.out.println("5: convert infix and evaluate");
			System.out.println("Original expression " + testString5);
			String testStringP1 = infix.convertToPostfix (testString5);
			System.out.println("postfix expression " + testStringP1);
			System.out.println("result: " + pf.evalPostfix( testStringP1));
			System.out.println();
           
			System.out.println("6: convert infix and evaluate");
			System.out.println("Original expression " + testString6);
			String testStringP2 = infix.convertToPostfix(testString6);
			System.out.println("postfix expression " + testStringP2);
			System.out.println("result: " + pf.evalPostfix(testStringP2));
			System.out.println();

			System.out.println("7: convert infix and evaluate");
			System.out.println("Original expression " + testString7);
			String testStringP3 = infix.convertToPostfix(testString7);
			System.out.println("postfix expression " + testStringP3);
			System.out.println("result: " + pf.evalPostfix(testStringP3));
			System.out.println();

			System.out.println("8: convert infix and evaluate");
			System.out.println("Original expression " + testString8);
		    String testStringP4 = infix.convertToPostfix(testString8);
			System.out.println("postfix expression " + testStringP4);
			System.out.println("result: " + pf.evalPostfix(testStringP4 ));
			System.out.println();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}  // end main
}