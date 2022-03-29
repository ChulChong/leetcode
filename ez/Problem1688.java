public class Problem1688 {
    public static void main(String[] args) {
        int input = 7;
        System.out.println(numberOfMatches(input));
    }

    public static int numberOfMatches(int n) {
        int matches = 0;
        while (n == 1) {
            if (n % 2 == 0) {
                System.out.println(n / 2);
            } else {
                System.out.println((n - 1) / 2 + 1);
            }
        }
        return n;

    }
}
