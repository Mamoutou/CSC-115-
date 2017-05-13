package course;

public class ListNode {

	Object data; //holds our data
	ListNode next; // null, or points to next node
	public ListNode() { // default empty node
	   data = null;
	   next = null;
	}
	public ListNode(Object o) {
	   data = o;
	   next = null;
	}
	public ListNode(Object o, ListNode nx) {
	   data = o;
	   next = nx;
	}

	// Getter – grab the nodes data
	public Object getValue ( ) {
	   return data;
	}
	// Getter – grabs the next node reference
	public ListNode getNext ( ) {
	    return next;
	}
	//setter – sets the data value
	public void setValue (Object v) {
	    data = v;
	}
	//setter – dest the next reference.
	public void setNext (ListNode nx) {
	   next = nx;
	}
  
}
 class SimpleLL {
	 
	// Method to print out the list using a while loop
	// passing in the starting element of the list to print
	public static void printListWhile(ListNode s) {
	// as long as s is not null (end of list)
	   while (s != null) {
	      // get the value of the node,
	      System.out.print(s.getValue() + "\t");
	      // set s to point to the next node
	      s = s.getNext();
	  }
	  // put the cursor on a new line
      System.out.println();
   }
	
	// Method to print out the list using a for loop
	// passing in the starting element of the list to print
	public static void printListFor(ListNode s) {
		
    	for (ListNode node = s; node != null; node = node.getNext()) {
        	System.out.print(node.getValue() + "\t");
	    }
	    System.out.println();
	}
}
	
