import java.util.ArrayList;

public class J03CheckCharacter {
    public static int findFirstIndex(String s, char ch) {
        ArrayList<Character> charList = new ArrayList<>();

        // Convert string to ArrayList of Characters
        for (char c : s.toCharArray()) {
            charList.add(c);
        }

        // Find the index of the first occurrence of ch
        return charList.indexOf(ch); // returns -1 if not found
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch = 'k';

        int index = findFirstIndex(s, ch);
        System.out.println("First occurrence of '" + ch + "' is at index: " + index);
    }
}
