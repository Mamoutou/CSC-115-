package course;

public class SingleLLDriver {
   public static void main (String []args) {
	   
    ListNode start;
    SingleLL sLL = new SingleLL();
    start = sLL.add(new Integer(7));
    start = sLL.add(new Integer(11));
    start = sLL.add(new Integer(13));
    SimpleLL.printListWhile(sLL.getFront()); //13 11 7
    sLL.removeLast();
    SimpleLL.printListFor(sLL.getFront()); 
  }
}