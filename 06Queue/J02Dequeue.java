import java.util.*;

public class J02Dequeue {
    public static void main(String[] args) {
        Queue<String> queue_list = new ArrayDeque<>();
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        queue_list.add("Red");

        Iterator itr = queue_list.iterator();
        System.out.print("Queue Elements : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  ");
        }
    }
}
