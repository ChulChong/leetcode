import java.util.ArrayList;
import java.util.List;

public class Problem2194 {
    public static void main(String[] args) {
        String s = "K1:L2";
        System.out.println(cellsInRange(s));
    }

    public static List<String> cellsInRange(String s) {
        char[] arr = s.toCharArray();
        char c1 = arr[0], c2 = arr[3], r1 = arr[1], r2 = arr[4];
        List<String> list = new ArrayList<>();

        for (char c = c1; c <= c2; ++c) {
            for (char r = r1; r <= r2; ++r) {
                list.add("" + c + r);
            }
        }

        return list;
    }
}

