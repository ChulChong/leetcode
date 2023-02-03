import java.util.Arrays;

public class Problem2545 {

    public static void main(String[] args) {
        int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int k = 2;
        System.out.println(Arrays.deepToString(sortTheStudents(score, k)));
        //https://leetcode.com/problems/sort-the-students-by-their-kth-score/
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                if (score[j][k] < score[j + 1][k]) {
                    sortHelper(score, j, j + 1);
                }
            }
        }
        return score;

    }

    static void sortHelper(int[][] score, int row1, int row2) {
        for (int i = row1; i < row2; i++) {
            for (int j = 0; j < score[i].length; j++) {
                int tmp = score[i][j];
                score[i][j] = score[i + 1][j];
                score[i + 1][j] = tmp;
            }
        }
    }


}
