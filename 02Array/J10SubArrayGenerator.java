import java.util.List;
import java.util.ArrayList;

public class J10SubArrayGenerator {

    public static List<List<Integer>> generateSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                result.add(subarray);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> subarrays = generateSubarrays(arr);

        System.out.println(subarrays);
    }
}
