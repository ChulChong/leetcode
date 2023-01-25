import java.util.Arrays;

public class Problem2469 {
    public static void main(String[] args) {

        double celsius = 36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));

        //https://leetcode.com/problems/convert-the-temperature/

    }

    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;

        return ans;
    }
}
