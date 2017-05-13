package Assignment5;

/**
 * @purpose: a queue implemented using a linked list. LinkedQueue.java
 */
public class LinkedQueue {

    private Node firstNode;
    private Node lastNode;

    /**
     * constructor that sets the first & last node reference to null
     */
    public LinkedQueue() {
        firstNode = lastNode = null;
    }  // end default constructor

    /**
     * determines if the queue is empty
     *
     * @return returns true if the list is empty
     */
    public boolean isEmpty() {
        return firstNode == null;
    }  // end isEmpty

    /**
     * clears the queue
     */
    public void dequeueAll() {
        firstNode = lastNode = null;
    }  // end dequeueAll

    /**
     * adds a new item to the queue
     *
     * @param newItem the new item to be added to the queue
     */
    public void enqueue(Object newItem) {
        Node newNode = new Node();
        newNode.data = newItem;
        newNode.next = null;

        // insert the new node
        if (isEmpty()) {
            // insertion into empty queue
            firstNode = newNode;
        } else {
            // insertion into nonempty queue
            lastNode.next = newNode;

        }  // end if

        lastNode = newNode;  // new node is at back
    }  // end enqueue

    /**
     * removes an item from the queue
     *
     * @return returns the item removed from the queue
     */
    public Object dequeue() throws Exception {
        if (!isEmpty()) {
            // queue is not empty; remove front
            Node temp = firstNode;
            if (firstNode == lastNode) { // special case?
                firstNode = lastNode = null;     // yes, one node in queue
            } else {
                firstNode = firstNode.next;
            }  // end if

            return temp.data;
        } else {
            throw new Exception("Exception on dequeue: queue empty");
        }  // end if

    }  // end dequeue

    /**
     * looks at the first item in the queue
     *
     * @return returns the item just looked at.
     */
    public Object peek() throws Exception {
        if (!isEmpty()) {
            // queue is not empty; retrieve front
            return firstNode.data;
        } else {
            throw new Exception("Exception on peek: queue empty");
        }  // end if
    }  // end peek
} // end LinkedQueue