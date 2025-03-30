import java.util.ArrayList;

public class J11ReverseArray {
    public static void usingSwappingElement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};

        usingSwappingElement(arr);
        System.out.println("\nUsing Swapping Elements:- ");
        printArray(arr);
    }
}
