public class J05RemoveOddIndex {
    public static void main(String[] args) {
        String str = "abcdef";
        int n = str.length();

        char[] chars = str.toCharArray();

        // StringBuilder to build the new string
        StringBuilder result = new StringBuilder();

        // Traverse the array 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // even index
                result.append(chars[i]);
            }
        }

        // Print the result
        System.out.println("Original String: " + str);
        System.out.println("String after removing odd index characters: " + result.toString());
    }
}
