package LinkedList;

public class ReverseLinkedList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCustom<Integer> list = new LinkedListCustom<Integer>();
		// for now my custom linked list does not take Node type. It takes integers.
		// However the reverse will perform reverse operation by treating element as node / object
		list.add(5);
		list.add(13);
		list.add(15);
		list.add(33);
		list.add(65);
		list.add(53);
		ReverseLinkedList reverse = new ReverseLinkedList();
		System.out.println((reverse.reverseSingly(list)).toString());
		
	}
	//Reverse the singly linked list
	public LinkedListCustom<Integer> reverseSingly(LinkedListCustom<Integer> theList) {
		LinkedNode<Integer> current = theList.getFront();
		LinkedNode<Integer> next = null;
		LinkedNode<Integer> previous = null;
		theList.setMyFrontNode(previous);
		while(current!=null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		
		theList.setMyFrontNode(previous);
		return theList;
	
	}

}
