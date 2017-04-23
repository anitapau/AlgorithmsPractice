package Queue;

public class MainForQueue {
		public static void main(String[] theArgs) {
			QueueUsingArray queue = new QueueUsingArray();
			queue.enQueue(5);
			queue.enQueue(4);
			queue.enQueue(4);
			queue.enQueue(3);
			queue.deQueue();
			queue.deQueue();
			queue.deQueue();
			queue.enQueue(1);
			queue.enQueue(1);
			queue.deQueue();
			queue.enQueue(1);
			queue.deQueue();
			queue.enQueue(4);
			queue.enQueue(4);
			queue.enQueue(3);
			System.out.println(queue.toString());
			System.out.println(queue.isEmpty());
		}
}
