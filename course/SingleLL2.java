package course;

public class SingleLL2 {

  private ListNode front, end;
  public SingleLL2 (Object o) {
	
    front = new ListNode(o);
    end = front;
  }

  public void append(Object obj){
	  
    ListNode element = new ListNode(obj);
    if(front == null)
      front = element;
    else
      end.next = element;
      end = element;
  }

  public void insertBefore(Object obj, Object newElement) {
	  
      ListNode element = new ListNode(newElement);
      ListNode n = front; ListNode p = front;
      if(n != null) { // empty list
      if(front.getValue().equals(obj)){ // first element ??
         front = element;
         element.setNext(n);

     } else {
            while(n != null) { // the rest of the list
               n = n.getNext();
                  if (n != null) {
                      if(n.getValue().equals(obj)) {
                            p.setNext(element);
                            element.setNext(n);
                      }
                      p = p.getNext();
                   } // if
             }//while
        }//else
     } //if
 }//end
}
