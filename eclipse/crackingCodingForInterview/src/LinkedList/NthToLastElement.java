package LinkedList;

public class NthToLastElement {
	public static void main (String[] theArgs) {
		LinkedListCustom<Integer> list = new LinkedListCustom<>();
		list.add(4);
		list.add(14);
		list.add(4);
		list.add(40);
		list.add(14);
		list.add(49);
		list.add(55);
		System.out.println(kthElement(list, 5));
	}

	//solution (o(n^2))
	public static int kth(LinkedListCustom<Integer> theList, int theKth) {
		LinkedNode<Integer> current = theList.getFront();
		while(current != null) {
			int i = 0;
			LinkedNode<Integer> runner = current;
			while(i < theKth && runner != null) {
				runner = runner.getNext();
				i++;
			}
			if(runner == null) {
				return current.getElement();
			}
			current = current.getNext();
		}
		
		return -1;
		
	}
	
	 
	//solution 2 (0(n))
	
	public static int kthElement(LinkedListCustom<Integer> theList, int theKth) {
		LinkedNode<Integer> current = theList.getFront();
		LinkedNode<Integer> tracker = theList.getFront();
		for(int i =0; i < theKth; i++) {
			if(tracker == null) {
				return -1;
			}
			tracker = tracker.getNext();
		}
		while(tracker != null) {
			current= current.getNext();
			tracker = tracker.getNext();
		}
		return current.getElement();
	}
}
