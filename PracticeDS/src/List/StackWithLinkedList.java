package List;

import java.util.EmptyStackException;

public class StackWithLinkedList {
	
	private NodeStack myTop;
	public StackWithLinkedList() {
		myTop = null;
	}

	public void push(final int theElement) {
		if(myTop == null) {
			myTop = new NodeStack(theElement);
		}
		else {
			NodeStack currentNode = new NodeStack(theElement);
			currentNode.setMyNext(myTop);
			myTop = currentNode;
		}
	}
	public int pop() {
		if(myTop == null) {
			throw new EmptyStackException();
		}
		int currentElement = myTop.getMyElement();
		myTop = myTop.getMyNext();
		return currentElement;
	}
	public int peek() {
		if(myTop == null) {
			throw new EmptyStackException();
		}
		return myTop.getMyElement();
	}
	public int size() {
		int count = 0;
		NodeStack currentTop = myTop;
		while (currentTop != null) {
			count++;
			currentTop = currentTop.getMyNext();
		}
		return count;
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("]" + myTop.getMyElement());
		NodeStack current = myTop.getMyNext();
		while(current!=null) {
			builder.append(" ,"+current.getMyElement());
			current = current.getMyNext();
		}
		
    	builder.append("[");
    	builder = builder.reverse();
    	return builder.toString();
	}
}
