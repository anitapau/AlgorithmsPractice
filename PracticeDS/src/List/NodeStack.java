package List;

public class NodeStack {
  private int myElement;
  private NodeStack myNext;
  public NodeStack(final int theElement) {
	  myElement = theElement;
  }
public int getMyElement() {
	return myElement;
}
public void setMyElement(int theElement) {
	myElement = theElement;
}
public NodeStack getMyNext() {
	return myNext;
}
public void setMyNext(NodeStack theNext) {
	myNext = theNext;
}
}
