package LinkedList;
public class LinkedNode<T>{
	/**
	 * character in the linked Node.
	 */
 private T myString;
	/**
	 * Data of any given type.
	 */
  private T myData;
  /**
   * Next node of the Linked List.
   */
  private LinkedNode<T> myNextNode;
  
  /**
   * Constructor to initialize the empty listNode.
   */
  public LinkedNode() {
	  myNextNode = null;
  }
  public LinkedNode(T theElement, T theData) {
	  myString = theElement;
	  myData = theData;
  }
  /**
   * Constructor to initialize the emply listNode.
   * @param theElement element to store in the data field.
   */
  public LinkedNode(final T theElement) {
	  this();
	  myData = theElement;
  }
  /**
   * This method returns the next node.
   * @return next node.
   */
  public LinkedNode<T> getNext() {
	  return myNextNode;
  }
  /**
   * Setter to set the next node.
   * @param theNode node
   */
  public void setNext(final LinkedNode<T> theNode) {
	  myNextNode = theNode;
  }
  /**
   * Getter to get the data.
   * @return
   */
  public T getElement() {
	  return myData;
  }

  public void setElement(final T theElement) {
	  myData = theElement;
  }
public T getMyString() {
	return myString;
}
public void setMyString(T myString) {
	this.myString = myString;
}

 
}
