import java.util.LinkedList;
import java.util.Queue;

public class J12QueueSumElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println("Queue Elements : " + queue);

        // Finding the sum of elements in the queue
        int sum = 0;

        for (int num : queue) {
            sum += num;
        }

        System.out.println("Sum of Elements in the Queue : " + sum);
    }
}
