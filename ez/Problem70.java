public class Problem70 {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(climbStairs(n));
        //https://leetcode.com/problems/climbing-stairs/description/
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        int ans = 0;
        int previous = 2;
        int current = 1;


        for (int i = 2; i < n; i++) {
            ans = previous + current;
            current = previous;
            previous = ans;
        }

        return ans;
    }
}
