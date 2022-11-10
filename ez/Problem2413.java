public class Problem2413 {

    public static void main(String[] args) {
        int n = 1;
        System.out.println(smallestEvenMultiple(n));
        //https://leetcode.com/problems/smallest-even-multiple/
    }

    public static int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }else{
            return 2 * n;
        }
    }
}
