import java.util.LinkedList;
import java.util.Queue;

public class J06EmptyorNot {
    public static void main(String[] args) {
        Queue<String> queue_list = new LinkedList<>();
        Queue<Integer> emp_list = new LinkedList<>();

        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");

        System.out.println("First Queue Elements : " + queue_list);

        // Check if the queue is empty
        boolean isEmpty = queue_list.isEmpty();
        if (isEmpty) {
            System.out.println("The First Queue is Empty");
        } else {
            System.out.println("The First Queue is Not Empty");
        }

        System.out.println("Second Queue Elements : " + emp_list);
        isEmpty = emp_list.isEmpty();
        if (isEmpty) {
            System.out.println("The Second Queue is Empty");
        } else {
            System.out.println("The Second Queue is Not Empty");
        }
    }
}
