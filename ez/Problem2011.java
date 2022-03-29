public class Problem2011 {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String s : operations) {
            if (s.equals("X++") || s.equals("++X")) {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }
}
