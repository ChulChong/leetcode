import java.util.*;

public class Problem49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> hm = new HashMap<>();
       for(String s : strs){
           char[] arr = s.toCharArray();
           Arrays.sort(arr);
           String sortedString = new String(arr);
           if(!hm.containsKey(sortedString)){
               hm.put(sortedString,new ArrayList<>());
           }
           hm.get(sortedString).add(s);
       }
       return new ArrayList<>(hm.values());

    }
}
