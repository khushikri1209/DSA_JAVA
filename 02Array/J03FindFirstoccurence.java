import java.util.*;

public class J03FindFirstoccurence {
    public static int findFirstOccurence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, };
        int key = 3;
        System.out.println(findFirstOccurence(arr, key));

    }

}
