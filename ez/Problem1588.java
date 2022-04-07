public class Problem1588 {
    //https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int endingHere = i + 1;
            int startingHere = n - i;
            int totalSubarrays = endingHere * startingHere;
            int oddSubarrays = totalSubarrays / 2;
            if (totalSubarrays % 2 == 1) {
                oddSubarrays++;
            }
            result += oddSubarrays * arr[i];
        }

        return result;
    }
}
