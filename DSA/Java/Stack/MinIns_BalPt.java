//Minimum Insertions required to balance parenthesis in such a case that ( having )) for the match.
// Given a parentheses string containing only the characters and A parentheses string is balanced it:
// Any left parenthesis must have a corresponding two consecutive right parenthesis
// Left parenthesis must go before the corresponding two consecutive right parenthesis)
// In other words, we treat as an opening parenthesis and as a closing parenthesis.
// For example, "(0)", "(((1)))" and "(1))())))" are balanced"," ()))" and "(()))" are not balanced.
// You can insert the characters and 1 at any position of the string to balance it if needed
// Return the minimum number of insertions needed to make s balanced.


package Stack;

import java.util.Stack;
public class MinIns_BalPt {
    public static int minAddToMakeValid(String s) {
      Stack<Character> stack = new Stack<>();
      for (int i=0;i<s.length();i++){
          char ch=s.charAt(i);
        if (ch == ')'&&i + 1 < s.length() && s.charAt(i + 1) == ')') {
            i++;
          if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
          } else {
            stack.push(ch);
          }
        } else {
          stack.push(ch);
        }
      }
      return stack.size();
    }
    public static void main(String args[])
    {
        System.out.println(minAddToMakeValid("(()))"));
    }
}