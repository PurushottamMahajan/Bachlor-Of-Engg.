package Stack;

import java.util.Stack;

public class PrefixEvaluation {
    
    public static int evaluatePrefix(String expr) {
        Stack<Integer> stack = new Stack<>();
        
        // Traverse from right to left
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);
            
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            } else if (isOperator(ch)) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = applyOperator(ch, op1, op2);
                stack.push(result);
            }
        }
        return stack.pop();
    }
    
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int applyOperator(char operator, int a, int b) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        String expr = "-+7*45+20"; // Equivalent to (7 + (4 * 5)) - (2 + 0) = 25 - 2 = 23
        int result = evaluatePrefix(expr);
        System.out.println("Result: " + result);
    }
}

