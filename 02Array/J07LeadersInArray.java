import java.util.ArrayList;
public class J07LeadersInArray {
    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        
        // The rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);
        
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i]; // Update max
                leaders.add(maxFromRight);
            }
        }
        
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = findLeaders(arr);
        
        // Print the leaders
        for (int leader : result) {
            System.out.print(leader + " ");
        }
    }
}

    

