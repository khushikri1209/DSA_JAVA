import java.util.Scanner;
public class J02CheckTwoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check if strings are identical (case-sensitive)
        if (str1.equals(str2)) {
            System.out.println("Strings are identical.");
        } else {
            System.out.println("Strings are NOT identical.");
        }

        sc.close();
    }
}

    

