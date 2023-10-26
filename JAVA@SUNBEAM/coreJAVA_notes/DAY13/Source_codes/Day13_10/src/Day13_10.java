import java.util.ArrayDeque;
import java.util.Deque;

public class Day13_10 {

	public static void main(String[] args) {
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.offer(20);
		q.offer(30);
		System.out.println("Queue elements ="+q);
		q.offerFirst(10);
		System.out.println("Queue = "+q);
		q.offerLast(40);
		System.out.println("Queue = "+q);
		System.out.println("Peek first = "+q.peekFirst());
		System.out.println("Peek last = "+q.peekLast());
		System.out.println("Poll First = "+q.pollFirst());
		System.out.println("Poll Last = "+q.pollLast());
		System.out.println("Queue = "+q);
		
		
		
	}

}
