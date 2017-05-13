package Assignment4;

/**
 * no limitation to size currently, but take care of the possibility that we may want to put a cap on the size.
 */



public class LinkedStack implements StackInterface {

	private Node top;

	public LinkedStack() {

		top = null;

	}  // end default constructor

	public boolean isEmpty() {

		return top ==  null;

	}  // end isEmpty


	public void push(Object newItem) {

		Node n = new Node();
		n.setData(newItem);
		n.setNext(top);
		top = n;

	}  // end push

	public Object pop() throws Exception {

		if (!isEmpty()) {
			Node temp = top;
			top = top.getNext();
			return temp.getData();
		} else {
			throw new Exception("StackException on pop: stack empty");
		}  // end if

	}  // end pop	
	
	public Object peek() throws Exception {

		if (!isEmpty()) {
			return top.getData();
		} else {
			throw new Exception("StackException on peek: stack empty");
		} 

	}  // end peek

}  // end LinkedStack