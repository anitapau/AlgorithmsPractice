package LinkedList;

import java.util.LinkedList;

public class RemmoveDuplicatesFromUnsortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCustom<Integer> list = new LinkedListCustom<>();
		list.add(4);
		list.add(14);
		list.add(4);
		list.add(40);
		list.add(4);
		list.add(49);
		list.add(55);
		removeDup(list);
		System.out.println(list.toString());
		
	}
	
	//if temporary buffer is allowed
	public static LinkedList<Integer> removeDuplicate(LinkedList<Integer> input) {
		LinkedList<Integer> temporaryList = new LinkedList<>();
		for(int i = 0; i < input.size(); i++) {
			if(!temporaryList.contains(input.get(i))) {
				temporaryList.add(input.get(i));
			}
		}
		input.clear();
		input.addAll(temporaryList);
		return input;
		
	}
	
	//if temporary buffer is not allowed
	public static void removeDuplicates(LinkedListCustom<Integer> theList){
		if(theList.getFront()!= null) {
			 LinkedNode<Integer> node = theList.getFront();
			 LinkedNode<Integer> currentNode = node.getNext();
			 while(currentNode!= null) {
				 LinkedNode<Integer> tracker = theList.getFront();
				 while(tracker != currentNode) {
					 if(tracker.getElement() == currentNode.getElement()) {
						 LinkedNode<Integer> temp = currentNode.getNext();
						 node.setNext(temp);
						 currentNode = temp;
						 break;
					 }
					 tracker = tracker.getNext();
				 }
				 if(tracker == currentNode) {
					 node = currentNode;
					 currentNode = currentNode.getNext();
				 }
			 }
		}
	}
	
	//book solution
	public static void removeDup(LinkedListCustom<Integer> theList){
		if(theList.getFront()!= null) {
			 LinkedNode<Integer> currentNode = theList.getFront();
			 while(currentNode!= null) {
				 LinkedNode<Integer> tracker = currentNode;
				 while(tracker.getNext() != null) {
					 if(tracker.getNext().getElement() == currentNode.getElement()) {
						 tracker.setNext(tracker.getNext().getNext()); 
						 
					 }
					 else {
						 tracker = tracker.getNext();
					 }
				 }
				 currentNode = currentNode.getNext();
			 }
		}
	}
	

}
