package LinkedList;
public class DeleteTheMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCustom<Integer> list = new LinkedListCustom<>();
		list.add(14);
		list.add(41);
		list.add(40);
		list.add(4);
		list.add(49);
		list.add(55);
		deleteNode(list,4);
		System.out.println(list.toString());
	}
	
	//anyNode except  first and last (doesnot mean exact middle)
	public static boolean deleteTheMiddle(LinkedListCustom<Integer> theList) {
		LinkedNode<Integer> current = theList.getFront();
		if(theList.getFront() == null || current.getNext() == null) {
			//failure 
			return false;
		}
		current = current.getNext().getNext();
		theList.getFront().setNext(current);
		return true;
	}
	
	
	//delete middle node (not the front not the end) if the node is given 
	//since I have not added object on my linkedList and implemented the compareto, I am using int as a node value
	// Assuming no duplicates. (this will now work as node that needs to be deleted)
	public static void deleteNode(LinkedListCustom<Integer> theList, int theValue) {
		if(theList.getFront()!= null) {
			LinkedNode<Integer> current = theList.getFront();
			while(current.getNext() != null) {
				if(current.getNext().getElement() == theValue) {
					current.setNext(current.getNext().getNext());
				}
					
				current = current.getNext();
			}
		}
	}
	
	

}
