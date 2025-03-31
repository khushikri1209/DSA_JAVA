public class J12RotateArray {
    public static void usingTemporaryArray(int arr[], int d) {
        int n = arr.length;
        d %= n;  
        int temp[] = new int[n];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }

        for (int i = 0; i < n - d; i++) {
            temp[d + i] = arr[i];
        }

        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2; 

        System.out.println("Using temporary array:");
        usingTemporaryArray(arr, d);
        printArray(arr);
    }
}
