package List;

import java.util.Arrays;
import java.util.EmptyStackException;


public class StackWithArray {
    private static int ARRAY_SIZE = 5;
    private static int TOP = -1;
    private static int[] myArray;
    public StackWithArray() {
    	myArray = new int[ARRAY_SIZE];
    }
    
    public void push(final int theElement) {
    	if(myArray.length == TOP + 1) {
    		myArray = Arrays.copyOf(myArray, ARRAY_SIZE * 2);
    	}
    	TOP++;
    	myArray [TOP] = theElement;
    	
    }
    public int pop() {
    	if(TOP <= 0) {
    		throw new EmptyStackException();
    	}
    	return myArray[TOP--];
    	
    	
    	
    }
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	builder.append("[" + myArray[0]);
    	for(int i = 1; i <= TOP; i++) {
    		builder.append(", " + myArray[i]);
    	}
    	builder.append("]");
    	return builder.toString();
    }
    public int peek() {
    	if(TOP == -1) {
    		throw new EmptyStackException();
    	}
    	else {
    		return myArray[TOP];
    	}
    	
    }
    public int size() {
    	return TOP + 1;
    }
    public boolean isEmpty() {
    	if(TOP < 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
}
