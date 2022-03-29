public class Problem2114 {
    public Problem2114() {
    }

    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        String[] var2 = sentences;
        int var3 = sentences.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String word = var2[var4];
            String[] words = word.split(" ");
            max = Math.max(words.length, max);
        }

        return max;
    }
}
