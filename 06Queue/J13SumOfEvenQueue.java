import java.util.*;

public class J13SumOfEvenQueue {
	public static int findEvenSum(Queue<Integer> queue)
	{
		int sum = 0;
		System.out.print("Even Numbers : ");
		for (int num : queue)
		{
			if (num % 2 == 0)
			{
				sum += num;
				System.out.print(" " + num);
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
		queue.offer(7);
		queue.offer(8);
		queue.offer(9);
		queue.offer(10);
		System.out.println("Original Queue : " + queue);

		int evenSum = findEvenSum(queue);
		System.out.println("\nSum of Even Numbers in the Queue : " + evenSum);
	}
}


    
