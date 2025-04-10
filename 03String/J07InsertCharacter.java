public class J07InsertCharacter {
    public static void main(String[] args) {
        String original = "HellKhushi";
        char insertChar = 'o';
        int position = 4; 

        char[] originalArray = original.toCharArray();
        char[] newArray = new char[originalArray.length + 1]; 

        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }

        newArray[position] = insertChar; 

        for (int i = position; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i]; 
        }

        String result = new String(newArray);

        System.out.println("Original String: " + original);
        System.out.println("After Insertion: " + result);
    }
}
