package bagList;

import java.util.*;

public class BagADT {

    private static Random rand = new Random();
    private final int NOT_FOUND = -1;
    private int size;
    private ListNode head;
    private Object data;

    /** Creates an empty bag using the default capacity*/
    public BagADT() {
        size = 0;
        head = null;
        data = null;
    }


    /**
     * Add a specified element to the bag, expanding the capacity of the bag
     * array if necessary
     * @param newElement the element to add to the bag
     */
    public void add(Object newElement) {
        ListNode n = new ListNode(newElement);
        n.setNext(head);
        head = n;
        size++;
    }

    public int size(){
        return size;
    }

    public void printList() {
        ListNode tmp = new ListNode();
        tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getValue() + "\t");
            tmp = tmp.getNext();
        }
        System.out.println();
    }

    // remove a random element (not data)
    public Object removeRandom() {
        int element = rand.nextInt(size)+1;
        System.out.println("\n"+element+"\n");
        int cnt = 0;
        ListNode prev = head;
        ListNode cur = head;

        if (element == 1) { //this is the head of the list
            head = head.getNext();

        } else {
            while (cur.getNext() != null) {
                cur = cur.getNext();
                cnt++;
                if (cnt == element-1) {
                    prev.setNext(cur.getNext());
                    size--;
                    break;
                }
                prev = prev.getNext();
            }
        }

        return cur.getValue();



    }

}

