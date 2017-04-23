package List;

public class MainForList {
   public static void main(String[] theArgs){
	 /*  StackWithArray stack = new StackWithArray();
	   stack.push(5);
	   stack.push(4);
	  
	  System.out.println(stack.peek());
	   stack.push(3);
	   stack.push(4);
	   stack.push(3);
	   System.out.println(stack.pop());
	   System.out.println(stack.peek());
	   System.out.println(stack.pop());
	   System.out.println(stack.peek());
	   stack.push(3);
	   stack.push(4);
	   stack.push(3);
	   stack.push(3);
	   stack.push(4);
	   stack.push(3);
	   System.out.println(stack.toString());*/
	   
	   StackWithLinkedList stack = new StackWithLinkedList();
	   stack.push(5);
	   stack.push(5);
	   stack.push(4);
	   stack.push(3);
	   System.out.println(stack.pop());
	   System.out.println(stack.peek());
	   stack.push(3);
	   stack.push(4);
	   stack.push(3);
	   System.out.println(stack.toString());
   }
}
