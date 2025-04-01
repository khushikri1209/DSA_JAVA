import java.util.Arrays;

public class J13ZeroToEnd {

    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        moveZeros(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
