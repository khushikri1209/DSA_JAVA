import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class J15DistinctElement {
    
    // [Naive Approach] Using Nested loops – O(n^2) Time and O(1) Space
    public static ArrayList<Integer> usingNestedLoop(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    // [Better Approach] Using Sorting – O(n*logn) Time and O(1) Space
    public static ArrayList<Integer> usingSorting(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    // [Expected Approach]
}