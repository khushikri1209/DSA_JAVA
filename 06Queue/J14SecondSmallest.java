import java.util.*;
public class J14SecondSmallest {
	public static int findSecondSmallest(Queue<Integer> queue)
	{
		if (queue.size() < 2)
		{
			throw new NoSuchElementException("Queue does not have enough elements");
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : queue)
		{
			if (num < smallest)
			{
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest)
			{
				secondSmallest = num;
			}
		}

		return secondSmallest;
    }

	public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		System.out.println("Original Queue : "+queue);

		int secondSmallest = findSecondSmallest(queue);
		System.out.println("Second smallest element in the queue : " + secondSmallest);
	}
}
    

