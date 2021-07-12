public class Problem1689 {
    public static void main(String[] args) {

        String n = "27346209830709182346";

        System.out.println(minPartitions(n));

    }

    public static int minPartitions(String n) {

        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(max, n.charAt(i)-'0');
        }
        return max;

    }
}
