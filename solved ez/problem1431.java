import java.util.ArrayList;
import java.util.List;

class problem1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> wasssup = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                wasssup.add(false);
            } else wasssup.add(true);
        }
        return wasssup;
    }
}
