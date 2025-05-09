import java.util.*;
public class J15SumOfOddNumber {
    public static void printOddNumbers(Queue<Integer> queue) {
        System.out.print("Odd Numbers in the Queue : ");
        for (int num : queue) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
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

        printOddNumbers(queue);
    }
}
