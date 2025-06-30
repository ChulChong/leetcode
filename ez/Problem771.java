import java.util.HashSet;

public class Problem771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        for (char d : stones.toCharArray()) {
            if (set.contains(d)) {
                count++;
            }
        }
        return count;
    }
}
