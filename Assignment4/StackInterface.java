package Assignment4;

public interface StackInterface {

/** Determines whether the stack is empty.
 Precondition: None.
 Postcondition: Returns true if the stack is empty;
 otherwise returns false.  
 **/
  public boolean isEmpty();

/** Adds an item to the top of a stack.
 Precondition: newItem is the item to be added.
 Postcondition: If insertion is successful, newItem
 is on the top of the stack.
 Exception: Some implementations may throw
 StackException when newItem cannot be placed on
 the stack.
 **/
public void push(Object newItem) throws Exception;


/** Removes the top of a stack.
 Precondition: None.
 Postcondition: If the stack is not empty, the item
 that was added most recently is removed from the
 stack and returned.
 Exception: Throws StackException if the stack is
 empty.
 **/
public Object pop() throws Exception;


/** Retrieves the top of a stack.
 Precondition: None.
 Postcondition: If the stack is not empty, the item
 that was added most recently is returned. The
 stack is unchanged.
 Exception: Throws StackException if the stack is
 empty.
 **/
public Object peek() throws Exception;

}  // end StackInterface
