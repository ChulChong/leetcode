import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem2520 {
    public static void main(String[] args) {
        int num = 54;
        System.out.println(countDigits(num));
        //https://leetcode.com/problems/count-the-digits-that-divide-a-number/
    }

    public static int countDigits(int num) {

        List<Integer> arrList = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int i = 10;
        int count = 0;
        int originalNum = num;
        while (num % i != 0) {
            hs.add(num % i);
            arrList.add(num % i);
            num /= i;
        }
        for (int j = 0; j < arrList.size(); j++) {
            if (originalNum % arrList.get(j) == 0 && !hs.contains(i)) {
                count++;
            }
        }

        return count;
    }

    public static int countDigits2(int num) {
        String str = Integer.toString(num);

        // Initialize a count to keep track of the number of digits that divide num
        int count = 0;

        // Iterate through the digits in the string
        for (int i = 0; i < str.length(); i++) {
            // Convert the current character to an integer
            int digit = Character.getNumericValue(str.charAt(i));

            // Check if the digit divides num
            if (num % digit == 0) {
                // If it does, increment the count
                count++;
            }
        }

        // Return the count
        return count;
    }
}
