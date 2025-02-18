// Java program  to check for even or odd.
//Approach by finding the remainder.
class J01CheckNumber {

    public static boolean isEven(int n)  {
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        int n = 101;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
