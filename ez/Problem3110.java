public class Problem3110 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/score-of-a-string/
        String s = "hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int ans = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            ans += Math.abs(arr[i] - arr[i + 1]);
        }
        return ans;
    }


}
