import java.util.Arrays;

public class J05SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 15, 13, 18, 11, 23, 27 };
        System.out.println("Second Largest Element: " + findSecondLargest(arr));
    }
}
