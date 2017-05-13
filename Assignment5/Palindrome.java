package Assignment5;

import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *   
 * determines if the string is a palindrome. Ignores case as well as all
   * punctuation and whitespace
   * @param testString the string being tested to see if it is a palindrome
   * @return returns true if the string is a palindrome, false otherwise
   *
 * @author Mamoutou Sangare
 * lab 5 comp 139
 */
public class Palindrome {

	
	// LinkedStack stack = new LinkedStack();
     LinkedQueue queue = new LinkedQueue();
           
     public boolean isPalindrome(String testString) throws Exception {
         boolean check = false;
         LinkedQueue queue = new LinkedQueue();
         
         if (!testString.isEmpty()) {
              String reverseString ="";
              String newString ="";
         
             newString = ingnorePunctuationSpaceType(testString);
             char ch;
   
             for (int i = newString.length()-1; i >= 0; i--) {
                 ch = newString.charAt(i);
                 queue.enqueue(ch);
             }

             while (!queue.isEmpty()) {
                 reverseString = reverseString + queue.dequeue();
             }
             if ((newString.equals(reverseString)))
           	   check = true;
             else 
               check = false;
        }
        else {
       	 throw new Exception("exception thrown");
        }
         return check;
      }
     
      private String ingnorePunctuationSpaceType (String x){
    	  
   	     String output="";
   	     String newString;
   	     newString = x.toLowerCase().replaceAll("\\W", "");
   	     output = newString + output;
   	     return output;
     }
 }  
    
    
  


