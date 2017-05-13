package Assignment4;

import java.util.*;


/**
 * @author: Mamoutou Sangare
 *  @subject: comp139 @Lab: 4 @purpose: Evaluate the
 * postfix expression using stacks. PostFix.java
 */
  public class PostFix {

    LinkedStack s = new LinkedStack();
    Parenthesis p = new Parenthesis();
    String token = " ";
    String result= " ";
   
    /**
     * Determine if the charachter is an operator
     *
     * @param c the charachter to be determined as an operator
     * @return returns true if c is an operator (+ - * /)
     */
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    private boolean isOperator(String token) {
 	   return (token.equals("+") || 
 	          token.equals("-") || 
 		      token.equals("*") || 
               token.equals("/") );           
 	 }
    
    /**
     * Determine if the charachter is a space
     *
     * @param c the charachter to be determined as a space
     * @return returns true if c is a space
     */
    private boolean isSpace(char c) {
        return c == ' ';
    }

    /**
     * Evaluate the postfix expression. If the expression is invalid, throw a
     * StackException
     *
     * @param postfixExp the postfix expression to be evaluated
     * @return returns the result of the postfix expression
     */
    
    
    //--------------------------------------------------------------
    public String evalPostfix (String postfixExp) throws Exception{
    	
    	Double m1, m2;
    	double cal = 0.0 ;
        String output = "";
        
     	StringTokenizer st = new StringTokenizer(postfixExp,"+-*/ ", true);
        for(int j= 0; j<postfixExp.length(); j++) { 
     			   
     	char ch = postfixExp.charAt(j); 

     	while (st.hasMoreTokens()){
	          token = st.nextToken();
 			 char c = token.charAt(0);
 	   		  if (isSpace(c)){
 	   		  	//  continue;
 	   		  }
 			  else if (!isOperator(c)){
  	  		    	s.push(""+token);
  	  		  }
  	   		  else {
  	   			  
  	  		     String x1 = s.pop().toString();
  	  		     m1 = Double.parseDouble(x1);
  	  		     String x2 = s.pop().toString();
	  		     m2 = Double.parseDouble(x2);
	  		       
  	  		     switch(c)  {  // do arithmetic
  	  	    
  	  	            case '+':
  	  	            cal = m1 + m2;
  	  	            break;
  	  	            case '-':
  	  	            cal = m2 - m1;
  	  	            break;
  	  	            case '*':
  	  	            cal = m1 * m2;
  	  	            break;
  	  	            case '/':
  	  	            cal = m2 / m1;
  	  	            break;
  	  	            default:
  	  	           cal = 0.0;
  	  	          } 
  	  	          s.push(cal); 
  	  	      
  	  	       } 
 		   }
        }  
        if (!s.isEmpty()) {
 	    output = s.pop().toString();
        }
        return output;
     }  
    //=============================================================
    public int evaluate (String expr) throws Exception  {
    int op1, op2, result = 0;
    String token;
    StringTokenizer tokenizer = new StringTokenizer (expr);
    while (tokenizer.hasMoreTokens())
    {
    token = tokenizer.nextToken();
    if (isOperator(token))
    {
    op2 = (Integer)s.pop();
    op1 = (Integer)s.pop();
    result = evalSingleOp (token.charAt(0), op1, op2);
    s.push (new Integer(result));
    }
    else
    s.push (new Integer(Integer.parseInt(token)));
    }
    return result;
    }
    
    private int evalSingleOp (char operation, int op1, int op2)
    {
    int result = 0;
    switch (operation)
    {
    case '+':
    result = op1 + op2;
    break;
    case '-':
    result = op1 - op2;
    break;
    case '*':
    result = op1 * op2;
    break;
    case '/':
    result = op1 / op2;
    }
    return result;
    }
  }
  

  