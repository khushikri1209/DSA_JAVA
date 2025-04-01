import java.util.Arrays;

public class J14minimumincrement {
    public static int minOperations(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int target = arr[0];
        int operations = 0;

        for (int i = 1; i < n; i++) {
            int diff = arr[i] - target;
            if (diff % k != 0) {
                return -1;
            }
            operations += diff / k;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 19, 16 };
        int k = 3;
        System.out.println("Output: " + minOperations(arr, k));
    }
}