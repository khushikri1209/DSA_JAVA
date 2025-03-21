import java.util.Arrays;
public class J06TopThreeLargest {
    public static void findTopThreeLargest(int[] arr) {
        // Initialize three variables 
        Integer first = null, second = null, third = null;
        
        // Iterate through the array
        for (int num : arr) {
            if (first == null || num > first) {
                // Shift down the values
                third = second;
                second = first;
                first = num;
            } else if ((second == null || num > second) && num != first) {
                // Shift down the values
                third = second;
                second = num;
            } else if ((third == null || num > third) && num != first && num != second) {
                third = num;
            }
        }
        
        // Print the results
        System.out.println("Top three largest distinct elements are:");
        if (first != null) System.out.print(first + " ");
        if (second != null) System.out.print(second + " ");
        if (third != null) System.out.print(third);
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 78, 90};
        findTopThreeLargest(arr);
    }
}

    

