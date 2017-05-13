package bagList;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author saryta
 */
public class ListNode {
    
    private Object data;
    private ListNode next;
    
    public ListNode(){
    
        data = 0;
        next = null;

    }
    
    public ListNode(Object o) {
        data = o;
        next = null;
    }
    
    public ListNode(Object o, ListNode n) {
        data = o;
        n = next;
    }
    
    public Object getValue() {
        
        return data;
    }
    
    public ListNode getNext() {
        return next;
    }
    
    public void setValue (Object v) {
        data = v;
    }
    
    public void setNext (ListNode nx) {
        next = nx;
    }
    
}
