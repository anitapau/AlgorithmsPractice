package Queue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class QueueUsingArray {
	private static int SIZE = 50;
	private static int COUNT = 0;
	private static int TOP = 0;
	private static int INDEX = 0;
	private int myArray[];
	
	public QueueUsingArray() {
	 myArray = new int[TOP];
	}
	public void enQueue(final int theElement) {
		if(myArray.length == TOP) {
			myArray = Arrays.copyOf(myArray, myArray.length + SIZE);
		}
		myArray[TOP++] = theElement;
		COUNT++;
	}
	public int deQueue() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		COUNT--;
		return myArray[INDEX++];
		
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return myArray[INDEX];
	}
	public int size() {
		return COUNT;
	}
	public boolean isEmpty() {
		boolean result = false;
		if(COUNT <=0){
			result = true;
		}
		return result;
	}
	public String toString() {
		if(isEmpty()) {
			return "[ ]"; 
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[" + myArray[INDEX]);
		for(int i = INDEX + 1; i < TOP; i++) {
			builder.append(", " + myArray[i]);
		}
		builder.append("]");
		return builder.toString();
	}

}
