import java.util.ArrayList;

public class J02DistinctElement {
    // [Naive Approach] Using Nested loops – O(n^2) Time and O(1) Space
    public static ArrayList<Integer> usingLoop(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the element already exists in the previous elements
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break; // If duplicate is found, break out of the loop
                }
            }

            // If the element is not a duplicate, add it to the result list
            if (!isDuplicate) {
                res.add(arr[i]);
            }
        }

        return res; // Return the list of distinct elements
    }

    public static void main(String[] args) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };

        // Call the function and store the result
        ArrayList<Integer> J02DistinctElement = usingLoop(arr);

        // Print the distinct elements
        System.out.println(J02DistinctElement);
    }
}
