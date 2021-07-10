public class Problem1689 {
    public static void main(String[] args) {

        String n = "32";

        System.out.println(minPartitions(n));

    }

    public static int minPartitions(String n) {

        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int ch = n.charAt(i) - '0';
            max = Math.max(max, ch);
        }
        return max;

    }
}
