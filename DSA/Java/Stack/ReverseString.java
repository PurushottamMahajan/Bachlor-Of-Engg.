package Stack;


    
import java.util.Stack;

public class ReverseString {
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Purushottam";
        System.out.println("Reversed: " + reverse(input));
    }
}
    
