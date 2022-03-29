import java.util.ArrayList;
import java.util.List;

public class Problem1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        List<Integer> ls = new ArrayList<Integer>();
        while(n > 0){
            ls.add(n % 10);
            n /= 10;
        }
        int prod = 1;
        int sum = 0;
        for(int i = 0; i < ls.size(); i++){
            sum += ls.get(i);
            prod *= ls.get(i);
        }

        return prod - sum;
    }
}
