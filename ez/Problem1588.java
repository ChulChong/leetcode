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
            int endingHere = i + 1; //1 , 2
            int startingHere = n - i; //4 , 3
            int totalSubarrays = endingHere * startingHere; //4 , 6
            int oddSubarrays = totalSubarrays / 2; //2 , 3
            if (totalSubarrays % 2 == 1) { //true false
                oddSubarrays++; //3
            }
            result += oddSubarrays * arr[i]; // result += 3 , 12
        }

        return result;
    }
}
