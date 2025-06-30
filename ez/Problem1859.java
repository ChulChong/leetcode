public class Problem1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];

        for (String d : arr) {
            char[] c = d.toCharArray();
            ans[c[c.length - 1] - '0' - 1] = d.substring(0, c.length - 1);
        }
        for (String d : ans) {
            sb.append(d).append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}
