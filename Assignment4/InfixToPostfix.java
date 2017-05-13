package Assignment4;

/**
 * @author: Mamoutou Sangare
 * @subject: comp139
 * @Lab: 4
 * @purpose:  Convert an infix expression to postfix
 * InfixToPostfix.java
 */
import java.util.*;

public class InfixToPostfix {

    Parenthesis p = new Parenthesis();
    LinkedStack stack = new LinkedStack();
    String output = ""; 
  
    /**
     * Convert an infix expression to postfix. If the expression is invalid, throws an exception.
     * @param s the infix expression
     * @return the postfix expression as a string
     * hint:  StringTokenizer is very useful to this iteratively
     */
              
    public boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public void precedence(char curOp, int val) throws Exception {
        while (!stack.isEmpty()) {

            char topOp = (Character) stack.pop();

            if (topOp == '(') {
                stack.push(topOp);
                break;
            }
            else {
                int prec2;

                if (topOp == '+' || topOp == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }

                if (prec2 < val) 
                { 
                    stack.push(topOp); 
                    break;
                } else 
                {
                    output = output + topOp; 
                }
            }
        }    
    }
    
    /**
    * Evaluates the specified postfix expression. If an operand is
    * encountered, it is pushed onto the stack. If an operator is
    * encountered, two operands are popped, the operation is
    * evaluated, and the result is pushed onto the stack.
    * @param expr string representation of a postfix expression
    * @return value of the given expression
    */



     public String convertToPostfix(String input) throws Exception{
    	  
    	 output = "";
    	 input = input.trim();
         for (int j = 0; j < input.length(); j++) {
        	 
            char ch = input.charAt(j);
            switch (ch) {
               case '+': 
               case '-':
               gotOperator(ch, 1); 
               break; 
               case '*': 
               case '/':
               gotOperator(ch, 2); 
               break; 
               case '(': 
               stack.push(ch);
               break;
               case ')': 
               gotParen(ch); 
               break;
               default: 
               output = output + ch; 
               break;
           }
        }
        while (!stack.isEmpty()) {
          output = output + stack.pop();
        }
        return output; 
     }
     private void gotOperator(char opThis, int prec1) throws Exception {
        while (!stack.isEmpty()) {
          Character opTop = (Character) stack.pop();
          if (opTop == '(') {
             stack.push(opTop);
             break;
          }
          else {
            int prec2;
            if (opTop == '+' || opTop == '-')
            prec2 = 1;
            else
            prec2 = 2;
            if (prec2 < prec1) { 
               stack.push(opTop);
               break;
            }
		    else
              output = output + opTop;
           }
        }
        stack.push(opThis);
    }
   
    private void gotParen(char ch) throws Exception { 
      while (!stack.isEmpty()) {
         Character chx = (Character) stack.pop();
         if (chx == '(') 
         break; 
         else
         output = output + chx; 
      }
   }
}  
 
 

 
