import java.util.Stack;

public class Problem125 {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));

        //https://leetcode.com/problems/valid-palindrome/
    }

    public static boolean isPalindrome(String s) {
        String trimmedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : trimmedString.toCharArray()) {
            st.push(c);
        }
        for (int i = 0; i < trimmedString.length(); i++) {
            sb.append(st.pop());
        }
        return trimmedString.contentEquals(sb);
    }
}
