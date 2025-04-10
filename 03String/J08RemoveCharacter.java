import java.util.ArrayList;

public class J08RemoveCharacter {
    public static void main(String[] args) {
        String original = "Immortal";
        char removeChar = 'm';


        ArrayList<Character> charList = new ArrayList<>();
        for (char ch : original.toCharArray()) {
            charList.add(ch);
        }

        charList.removeIf(ch -> ch == removeChar);

        StringBuilder result = new StringBuilder();
        for (char ch : charList) {
            result.append(ch);
        }

        System.out.println("Original String: " + original);
        System.out.println("After Removing '" + removeChar + "': " + result.toString());
    }
}
