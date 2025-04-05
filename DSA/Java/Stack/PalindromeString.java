package Stack;
import java.util.Stack;
public class PalindromeString {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (stack.pop() != ch) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(s));
    }
}
