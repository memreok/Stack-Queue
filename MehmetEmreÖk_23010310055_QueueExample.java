package ödev7;

import java.util.LinkedList;
import java.util.Queue;

public class MehmetEmreÖk_23010310055_QueueExample {

	public static void main(String[] args) {

		String [] sehirleStrings = {"Adana", "Bartın", "Kayseri", "Malatya", "Zonguldak"};
		Queue<String> queue = new  LinkedList<String>();
		System.out.println("Queue; " + queue.isEmpty());
		queue.add("Ankara");
		System.out.println("Queue; " + queue);
		
		for (String berrin : sehirleStrings) {
			queue.add(berrin);
		}
		System.out.println("Queue; " + queue);
		System.out.println("Queue: " + queue.size());
		System.out.println("Queue ( peek ): " + queue.peek());
		System.out.println("Queue ( pop ): " + queue.remove());
		System.out.println("Queue (  pop tan sonra ): " + queue);
		
		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
		}
		
	}

}
