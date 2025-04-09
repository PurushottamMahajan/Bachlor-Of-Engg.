package Queue;

import java.util.*;

public class PalindromeQueue {
    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        for (int num : q) {
            stack.push(num);
        }

        for (int num : q) {
            if (num != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(2);
        q.add(1);

        System.out.println("Is Palindrome? " + isPalindrome(q));
    }
}
