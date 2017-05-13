package Assignment5;

/**
 * @purpose: Implements a stack using linked list LinkedStack.java
 */
public class LinkedStack {

    /**
     * a reference to the head of a linked list of items.
     */
    private Node top;

    /**
     * default constructor that sets the head of the list to null
     */
    public LinkedStack() {
        top = null;
    }  // end default constructor

    /**
     * Determines if the list is empty.
     *
     * @return returns true if the list is empty
     */
    public boolean isEmpty() {
        return top == null;
    }  // end isEmpty

    /**
     * Places a new node on the front of the list
     *
     * @param newItem the node to be placed at the front of the list
     */
    public void push(Object newItem) {
        Node n = new Node();
        n.data = newItem;
        n.next = top;
        top = n;

    }  // end push

    /**
     * Removes the front node of the list. Throws a StackException if the list
     * is empty
     *
     * @return returns the data element of the node just removed
     */
    public Object pop() throws Exception {

        if (!isEmpty()) {
            Node temp = top;
            top = top.next;
            return temp.data;
        } else {
            throw new Exception("Exception on pop: stack empty");
        }  // end if


    }  // end pop

    /**
     * Removes all nodes in the list.
     */
    public void popAll() {
        top = null;
    }  // end popAll

    /**
     * Takes a look at the top of the list. Throws a StackException if the list
     * is empty
     *
     * @return returns the data element of the top node but does not remove it.
     */
    public Object peek() throws Exception {
        if (!isEmpty()) {
            return top.data;
        } else {
            throw new Exception("Exception on peek: stack empty");
        }  // end if
    }  // end peek
}  // end LinkedStack

