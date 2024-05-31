import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(2);
        a.add(7);
        a.add(7);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(0);
        b.add(1);
        b.add(2);
        b.add(3);
        System.out.println(merge(a, b));
    }

    public static List<Integer> merge(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(a);
        Collections.sort(b);
        int aIndex = 0;
        int bIndex = 0;
        int len = a.size() + b.size();
        while (aIndex != a.size() && bIndex != b.size()) {
            if (a.get(aIndex) < b.get(bIndex)) {
                ans.add(a.get(aIndex));
                aIndex++;

            } else if (Objects.equals(a.get(aIndex), b.get(bIndex))) {
                ans.add(b.get(bIndex));
                bIndex++;
            } else if (a.get(aIndex) > b.get(bIndex)) {
                ans.add(b.get(bIndex));
                bIndex++;
            }
        }
        if (a.size() == aIndex) {
            while (b.size() != bIndex) {
                ans.add(b.get(bIndex));
                bIndex++;
            }
        } else {
            while (a.size() != aIndex) {
                ans.add(a.get(aIndex));
                aIndex++;
            }
        }

        return ans;
    }


}
