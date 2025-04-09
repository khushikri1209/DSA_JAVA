import java.util.Scanner;

public class J06AddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the strings
        String result = str1 + str2;

        // Display the result
        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}
