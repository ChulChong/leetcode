import java.util.Arrays;

public class Problem2160 {
    public Problem2160() {
    }

    public static void main(String[] args) {
        int num = 4009;
        System.out.println(minimumSum(num));
    }

    public static int minimumSum(int num) {
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int num1 = (arr[0] - 48) * 10 + arr[2] - 48;
        int num2 = (arr[1] - 48) * 10 + arr[3] - 48;
        return num1 + num2;
    }
}
