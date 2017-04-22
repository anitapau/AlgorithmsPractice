package LinkedList;

public class PartitionLinkedListAroundX {
	public static void main(String[] theArgs){
		LinkedListCustom<Integer> list = new LinkedListCustom<>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(1);
		partition(list, 5);
		System.out.println(list.toString());
	}
	
	public static void partition(LinkedListCustom<Integer> theList, int thePartition){
		LinkedNode<Integer> head = theList.getFront();
		LinkedNode<Integer> tail = theList.getFront();
		LinkedNode<Integer> front = theList.getFront();
		while(front != null) {
			LinkedNode<Integer> referenceList = front.getNext();
			if(front.getElement() < thePartition) {
				front.setNext(head);
				head = front;
			}
			else {
				tail.setNext(front);
				tail = front;
			}
			
			front = referenceList;
		}
		tail.setNext(null);
		theList.setMyFrontNode(head);
	}
	
}
