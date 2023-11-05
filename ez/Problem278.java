public class Problem278 {

    public static void main(String[] args) {
        int n = 1;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid, 1) && !isBadVersion(mid - 1, 1)) return mid;
            else if(!isBadVersion(mid, 1)){
                low = mid + 1;
            }
            else high = mid;
        }

        return -1;
    }

    public static boolean isBadVersion(int n, int bad) {
        return n == bad;
    }
}
