package course;

public class ListNodeDriver {

public static void main( String [] args) {
	
   ListNode start, newEl, temp;
   
   newEl = new ListNode(new Integer(7));
   start = newEl;
   
   // Inserting at the beginning of the list
   newEl = new ListNode(new Integer(11));
   newEl.setNext(start);
   start = newEl;
   newEl = new ListNode(new Integer(13));
   newEl.setNext(start);
   start = newEl;

   SimpleLL.printListWhile(start); // 13 11 7
   //points to the second node
   temp = start.getNext();
   // Deleting temp from the list
   start.setNext(temp.getNext());
   temp.setNext(null);
   SimpleLL.printListFor(start);
  }
}