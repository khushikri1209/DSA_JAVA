import java.util.Arrays;

public class J09DistinctSortedArray {

    public static int rearrangeAndCount(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        Arrays.sort(arr); // Step 1: Sort the array
        int index = 0; // Pointer for unique elements

        // Step 2: Iterate and move unique elements to the front
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i]; // Overwrite duplicate values
            }
        }

        return index + 1; // Length of distinct sorted subarray
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int length = rearrangeAndCount(arr);

        // Print the modified array with only the distinct sorted elements
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(arr, 0, length)));
        System.out.println("Length of distinct sorted subarray: " + length);
    }
}
