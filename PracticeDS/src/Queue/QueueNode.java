package Queue;

public class QueueNode {
	private QueueNode myNext;
	private int myElement;
	public QueueNode(final int theElement) {
		myElement = theElement;
	}
	public QueueNode getMyNext() {
		return myNext;
	}
	public void setMyNext(QueueNode theNext) {
		myNext = theNext;
	}
	public int getMyElement() {
		return myElement;
	}
	public void setMyElement(int theElement) {
		myElement =theElement;
	}
	
}
