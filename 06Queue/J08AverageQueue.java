import java.util.LinkedList;
import java.util.Queue;

public class J08AverageQueue {
    public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<>();

		// Adding elements to the queue
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		// Finding the average of elements in the queue
		int sum = 0;
		int count = 0;

		for (int num : queue)
		{
			sum += num;
			count++;
		}

		double ave = (double) sum / count;

		System.out.println("Average of Elements in the Queue : " + ave);
    }
}
