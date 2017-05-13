package course;

public class SingleLL {
	
   private ListNode front;
   
   public SingleLL() {
     front = null;
   }
   
   public ListNode getFront() {
      return front;
   }
   
   public ListNode add(Object x) {
     ListNode temp = new ListNode(x);
     temp.setNext(front);
     front = temp;
     return front;
   }

   public void removeLast() {
      ListNode node = front;
      while (node.getNext().getNext()!= null) {
         node = node.getNext();
      }
      node.setNext(null);
   }
}