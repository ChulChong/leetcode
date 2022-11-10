import java.util.HashMap;

public class Problem2325 {
    public static void main(String[] args) {

        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";

        System.out.println(decodeMessage(key, message));
        //https://leetcode.com/problems/decode-the-message/
    }

    public static String decodeMessage(String key, String message) {
        char[] arr = key.toCharArray();
        char[] ans = message.toCharArray();
        HashMap<Character, Character> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char original = 'a';
        for (char c : arr) {
            if (c != ' ' && !hm.containsKey(c)) {
                hm.put(c, original++);
            }
        }
       for (char c : ans){
           if(hm.containsKey(c)){
               sb.append(hm.get(c));
           }else{
               sb.append(c);
           }
       }

       return sb.toString();
    }
}
