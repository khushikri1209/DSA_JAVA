import java.util.*;

class J01Basic {
    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        // Iterate overall alternate elements
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        ArrayList<Integer> res = getAlternates(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }

    }
}