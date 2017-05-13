package Assignment5;


   /**
    * @param args the command line arguments
    */
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */

	/**
	 *
	 * @author Mamoutou Sangare
	 */
	public class Main {

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        Palindrome p = new Palindrome();
	        
	        String phrase1 = "race Car";
	        String phrase2 = "Dennis sinned";
	        String phrase3 = "Murder for a jar of red rum";
	        String phrase4 = "Are we not drawn onward we few drawn onward to new era";
	        String phrase5 = "Draw O Caesar Erase a coward";
	        String phrase6 = "Was it a rat I saw?";
	        String phrase7 = "I'm a lasagna. Hang asalami";
	        


	        /*determines if the phrase is a palindrome and prints result
	         * All of the above are palindromes - Make sure you test on ones
	         * that you know are not palidromes.
	         */
	        try {
	            if (p.isPalindrome(phrase1)) {
	                System.out.println(phrase1 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase1 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();

	            if (p.isPalindrome(phrase2)) {
	                System.out.println(phrase2 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase2 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();


	            if (p.isPalindrome(phrase3)) {
	                System.out.println(phrase3 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase3 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();

	            
	           
	            if (p.isPalindrome(phrase4)) {
	                System.out.println(phrase4 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase4 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();

	            
	            if (p.isPalindrome(phrase5)) {
	                System.out.println(phrase5 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase5 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();

	            
	            if (p.isPalindrome(phrase6)) {
	                System.out.println(phrase6 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase6 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();

	            if (p.isPalindrome(phrase7)) {
	                System.out.println(phrase7 + "\n" + "The phrase is a palindrome.");
	            } else {
	                System.out.println( phrase7 + "\n" + "The phrase is Not a palindrome.");
	            }
	            System.out.println ();

	        } catch (Exception e) {
	        }
	    }
	}

