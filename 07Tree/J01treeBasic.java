import java.util.TreeSet;
import java.util.Set;

public class J01Treebasic {
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<String> fruits = new TreeSet<>();

        // Adding elements to the TreeSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate element

        // Displaying the TreeSet
        System.out.println("TreeSet: " + fruits);
    }
}