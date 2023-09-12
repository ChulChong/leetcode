import java.util.Stack;

public class Retake {

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

        //https://leetcode.com/problems/valid-parentheses/
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c == '{') {
                st.push('}');
            } else if (c == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
