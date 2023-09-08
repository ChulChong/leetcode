import java.util.HashMap;

public class Problem1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

        //https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
    }

    public static boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        return hm.size() > 25;
    }


}
