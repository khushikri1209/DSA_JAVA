import java.util.Scanner;

public class J04InsertCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take initial string input
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        // Take character to insert
        System.out.print("Enter the character to insert: ");
        char c = scanner.next().charAt(0);

        // Take position where character needs to be inserted
        System.out.print("Enter the position to insert the character: ");
        int pos = scanner.nextInt();

        // Convert string to character array and perform insertion
        char[] original = s.toCharArray();
        char[] result = new char[original.length + 1];

        // Inserting character
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == pos) {
                result[i] = c;
            } else {
                result[i] = original[j];
                j++;
            }
        }

        // Print the result
        System.out.print("String after insertion: ");
        System.out.println(new String(result));

        scanner.close();
    }
}
