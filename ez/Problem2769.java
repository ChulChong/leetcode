public class Problem2769 {
    public static void main(String[] args) {
        int num = 4;
        int t = 1;

        System.out.println(theMaximumAchievableX(num,t));

        //https://leetcode.com/problems/find-the-maximum-achievable-number/description/
    }

    public static int theMaximumAchievableX(int num, int t) {
        return num + t + t;
    }
}
