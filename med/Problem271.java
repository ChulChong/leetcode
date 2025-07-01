import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem271 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));
        System.out.println(encode(strs));
        System.out.println(decode(encode(strs)));
    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int len = s.length();
            sb.append(len);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            ans.add(str.substring(i, i + len));
            i = i + len;
        }
        return ans;
    }

}
