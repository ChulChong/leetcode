import java.util.Arrays;

public class Problem832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
        //https://leetcode.com/problems/flipping-an-image/
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[][] ans = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = image[i][col - j - 1];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(ans[i][j]==0){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = 0;
                }

            }
        }

        return ans;
    }
}
