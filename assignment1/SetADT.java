package assignment1;

import java.util.*;

public class SetADT {

    private static Random rand = new Random();
    private final int DEFAULT_CAPACITY = 100;
    private final int NOT_FOUND = -1;
    private int size;
    private Object[] setArray;

    /**
     * Creates an empty set using the default capacity
     */
    public SetADT() {
        size = 0;
        setArray = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Creates and empty set using the specified capacity
     *
     * @param capacity user specified size of the array
     */
    public SetADT(int capacity) {
        size = 0;
        setArray = new Object[capacity];
    }

    public SetADT (Object [] v) {
    	  size = 0;
          setArray = new Object[DEFAULT_CAPACITY];
    }
    /**
     * Add a specified element to the set, expanding the capacity of the set
     * array if necessary
     *
     * @param newElement the element to add to the set
     */
    public void add(Object newElement) {

        if (size() == setArray.length) {
            resize();
        }
        
        boolean found = false;
        if  (!contains (newElement)){
             setArray[size] = newElement;
             size++;
             found = true;
            //System.out.println(newElement +"\t" + size);
       }   
    }

    /**
     * add's the contents of the parameter to this set
     *
     * @param set the set that will be added to the current set
     */
    public void addAll(SetADT set) {

        Object[] temp = set.getSetArray();

        for (int i = 0; i < set.size(); i++) {
            if (!this.containsValue(temp[i])) {
                add(temp[i]);
            }
        }
    }

    /**
     * @param element the element to find in the set
     * @return true if the element exists, false otherwise
     */
    public boolean contains(Object element) {

        for (int i = 0; i < size; i++) {
            if (setArray[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(Object element) {

        for (int i = 0; i < size; i++) {
            if (setArray[i].toString().equals(element.toString())) {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param set the comparison set
     * @return true if the two sets are equal, false otherwise
     */
    public boolean equals(SetADT set) {

        boolean result = false;
        Object element;

        if (size() == set.size()) {
            result = true;
            for (int i = 0; i < size(); i++) {
                element = setArray[i];
                if (!set.contains(element)) {
                    return false;

                }
            }
        }

        return result;
    }

    /**
     * determines if the set is empty or not
     *
     * @return boolean true, if the list is empty false otherwise
     */
    public boolean isEmpty() {

        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param element the element to be removed
     * @return the removed element
     */
    public Object remove(Object element) {

        Object result = new Integer(NOT_FOUND);
        int search = NOT_FOUND;

        if (!isEmpty()) {
            for (int i = 0; i < size() && search == NOT_FOUND; i++) {
                if (setArray[i].equals(element)) {
                    search = i;
                }
            }

            if (search != NOT_FOUND) {

                result = setArray[search];

                setArray[search] = setArray[size - 1];
                setArray[size - 1] = null;
                size--;
            }
        }

        return result;
    }

    /**
     * Removes a random element for the set and returns it
     *
     * @return
     */
    public Object removeRandom() {
        int element;
        Object value = new Integer(NOT_FOUND);

        if (!isEmpty()) {

            element = rand.nextInt(size);
            value = setArray[element];

            setArray[element] = setArray[size - 1];
            setArray[size - 1] = null;
            size--;
        }

        return value;
    }

    /**
     * returns the number of elements currently in the set
     *
     * @return int returns the number of elements in the set
     */
    public int size() {

        return size;
    }

    /**
     * @param set the set to join with this one
     * @return a new set containing both sets
     */
    public SetADT union(SetADT set) {

        SetADT newSet = new SetADT();

        newSet.addAll(this);
        newSet.addAll(set);

        return newSet;
    }

    /**
     * creates a larger array and copies all the elements from the original
     * array into the new one and reassigns the reference
     */
    private void resize() {

        Object[] newArray = new Object[setArray.length * 2];

        for (int i = 0; i < setArray.length; i++) {
            newArray[i] = setArray[i];
        }

        setArray = newArray;
    }

    public Object[] getSetArray() {

        return setArray;
    }

    /**
     * returns a string representation of the array
     */
    public String toString() {
        String result = "";

        for (int i = 0; i < size(); i++) {
            if ((i % 10) == 0 && i != 0) {
                result += "\n";
            }

            result = result + setArray[i].toString() + "\t";
        }
        return result;
    }

    public static String getObjectArray(Object[] o) {
        String s = "";
        for (int i = 0; i < o.length; i++) {
            s += (o[i] + " ");
        }
        return s;

    }
    /**
    * COMPLETE THE FOLLOWING METHODS
    *
    *  public SetADT intersection(SetADT set)
    *  public SetADT difference(SetADT set)
    *  public Object[] sorted()
    */
    
    /*determine the intersection between the sets
     * (elements common to the sets)     */
     public SetADT intersection(SetADT set){
          
    	 SetADT intSet = new SetADT();
            
            for (int i = 0; i < setArray.length; i++) {
            	
               if (set.contains (setArray[i])){
               
                  intSet.add(setArray[i]);
               }
            }
            return intSet;  
     } 
  //====================================================================
     /* 
      * get the elements that are not common to the sets
      */
    public SetADT difference (SetADT set) {
    	
    	SetADT unionSet = new SetADT ();
    	SetADT interSet = new SetADT ();
    	
    	unionSet = this.union(set);
    	interSet = this.intersection(set);
    	
    	for (int i=0; i < interSet.setArray.length; ++i){
    		
    		if (set.contains(setArray[i])){
    			
    			 unionSet.remove(setArray[i]);
    		}
    	}
 	  
       return  unionSet;
    }
  //====================================================================
    /* sort the element in the set 
     * from the smallest to the biggest
     */
    public Object[] sorted() {
    	
        int element = 0;
        Object object [] = new Object [setArray.length];
        Arrays.sort(setArray,0,size);
    
        for (int i=0; i< setArray.length; ++i){
    	    object[element] = setArray[i];
    	    ++element;
        }
        return object;
   }
}