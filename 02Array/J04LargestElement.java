class J04LargestElement {
    public static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0]; // Assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // If current element is greater, update max
                max = arr[i];
            }
        }

        return max; // Return the largest element
    }

    public static void main(String[] args) {
        int[] arr = { 20, 10, 20, 4, 100 };
        System.out.println("Largest element: " + findLargestElement(arr));
    }
}
