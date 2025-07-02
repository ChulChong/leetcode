import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Problem2942 {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        System.out.println();
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) < 0) {
                ans.add(i);
            }
        }
        return ans;

    }
}
