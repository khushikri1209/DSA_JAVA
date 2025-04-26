import java.util.*;

public class J05GetSize {
    public static void main(String[] args) {
        Queue<String> queue_list = new LinkedList<>();
        queue_list.add("Orange");
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        queue_list.add("Red");

        System.out.println("Queue Elements : " + queue_list);

        // Get the size of the queue
        int size = queue_list.size();
        System.out.println("Size of the Queue : " + size);

    }
}
