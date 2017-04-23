package Queue;

import java.util.EmptyStackException;

public class QueueUsingLinkedList {
	private QueueNode myFirst;
	private static int COUNT = 0;
	public QueueUsingLinkedList() {
		myFirst = null;
	}
	public void enQueue(final int theElement) {
		if(myFirst == null) {
			myFirst = new QueueNode(theElement);
			myFirst.setMyNext(null);
		}
		else {
			QueueNode currentNode = myFirst;
			while(currentNode.getMyNext() != null) {
				currentNode = currentNode.getMyNext();
			}
			currentNode.setMyNext(new QueueNode(theElement));
		}
		COUNT++;
	}
	public int deQueue() {
		if(myFirst == null) {
			throw new EmptyStackException();
		}
		int temp = myFirst.getMyElement();
		myFirst = myFirst.getMyNext();
		COUNT--;
		return temp;
		
	}
	public int size(){
		return COUNT;
	}
	
	public int peek() {
		if(myFirst!= null) {
			return myFirst.getMyElement();
		}
		throw new EmptyStackException();
	}
	public boolean isEmpty() {
		boolean result = false;
		if(COUNT >= 0) {
			result = true;
		}
		return result;
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[" + myFirst.getMyElement());
		QueueNode current = myFirst.getMyNext();
		while(current!=null) {
			builder.append(", " + current.getMyElement());
			current = current.getMyNext();
		}
		
    	builder.append("]");
    	return builder.toString();
	}
}
