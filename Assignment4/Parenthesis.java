package Assignment4;

/**
 * @author: Mamoutou Sangare @subject: comp139 @Lab: 4 @purpose: Determines if
 * the expression has balanced parenthesis using a stack Parenthesis.java
 */
public class Parenthesis {

      private LinkedStack stack = new LinkedStack();
      private Object openBrace;

    /**
     * Determine if the expression has matching parenthesis using a stack
     *
     * @param expr the expression to be evaluated
     * @return returns true if the expression has matching parenthesis
     */
    public boolean match(String expr) throws Exception {

       boolean foundMatch = true;
     
       for (int i= 0; i< expr.length(); ++i){
       	 char brace = expr.charAt(i);
    	 openBrace = new Character (brace);
    	 
    	 if (brace == '(')
    	     stack.push(openBrace);
    	 
         else if (brace ==')'){
        	  if (stack.isEmpty()){
       		     foundMatch = false;
        	      break;
        	   }
        	   else
        	      stack.pop();	    
         } 
       } 
     
      if (!stack.isEmpty())
    	 foundMatch = false;
   	     return foundMatch;
    }
 }


