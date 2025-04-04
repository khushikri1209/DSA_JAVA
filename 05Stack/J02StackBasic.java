import java.util.*;
public class J02StackBasic {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        int top = s.pop();
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}

    

