package LinkedList;

public class LinkedListCustom<T> {
	/**
	 * Track the size of a list.
	 */
	private int myCount = 0;
	/**
	 * Front node for the linked List.
	 */

	private LinkedNode<T> myFrontNode;

	/**
	 * 
	 * Constructor to initialize the data;
	 */
	public LinkedListCustom() {
		myFrontNode = null;
	}

	public void add(final T theElement) {
		if (myFrontNode == null) {
			myFrontNode = new LinkedNode<>();
			myFrontNode.setElement(theElement);

		} else {
			LinkedNode<T> current = myFrontNode;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			LinkedNode<T> newNode = new LinkedNode<>();
			newNode.setElement(theElement);
			current.setNext(newNode);
		}
		myCount++;
	}

	public String toString() {
		StringBuilder s = new StringBuilder(268);
		LinkedNode<T> current = myFrontNode;
		s.append("[");
		if (current != null) {
			s.append(current.getElement());
			current = current.getNext();
		}
		while (current != null) {
			s.append("," + current.getElement());
			current = current.getNext();
		}
		s.append("]");
		return s.toString();
	}

	public int getSize() {
		return myCount;
	}

	public LinkedNode<T> getFront() {
		return myFrontNode;
	}

	public void setMyFrontNode(LinkedNode<T> theFrontNode) {
		myFrontNode = theFrontNode;
	}

	public boolean contains(T theElement) {
		boolean result = false;
		if (myFrontNode == null) {
			return false;
		}
		LinkedNode<T> current = myFrontNode;
		while (current != null) {
			if (current.getElement() == theElement) {
				result = true;
			}
			current = current.getNext();
		}
		return result;
	}

	public LinkedNode<T> get(int theIndex) {
		int i = 0;
		LinkedNode<T> current = myFrontNode;
		while (i < theIndex) {
			current = current.getNext();
			i++;
		}
		return current;
	}

	public int[] convertToArray() {
		int[] theArray = new int[myCount];
		int i = 0;
		LinkedNode<T> current = myFrontNode;
		while (current != null) {
			theArray[i++] = (int) current.getElement();
			current = current.getNext();
		}
		return theArray;
	}

}
