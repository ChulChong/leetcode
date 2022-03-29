
public class Problem709 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                c += 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
