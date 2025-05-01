import java.util.LinkedList;
import java.util.Queue;

public class J09MergeQueue
{
	public static void main(String[] args)
	{
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();

		// Adding elements to queue1
		queue1.add(10);
		queue1.add(20);
		queue1.add(30);

		// Adding elements to queue2
		queue2.add(40);
		queue2.add(50);
		queue2.add(60);

		// Merging two queues
		Queue<Integer> mergedQueue = new LinkedList<>();
		mergedQueue.addAll(queue1);
		mergedQueue.addAll(queue2);

		System.out.println("Merged queue:");
		System.out.println(mergedQueue);
    }
}
