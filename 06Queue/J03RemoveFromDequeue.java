import java.util.LinkedList;
import java.util.Queue;

public class J03RemoveFromDequeue {
    public static void main(String[] args) {
        Queue<String> queue_list = new LinkedList<>();
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        queue_list.add("Red");

        System.out.println("Queue before Removal : " + queue_list);

        System.out.println("Removed Item is : " + queue_list.remove());

        System.out.println("Queue after Removal : " + queue_list);
    }
}
