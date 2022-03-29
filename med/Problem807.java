public class Problem807 {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));

        //expected output 35
        //Explanation: The building heights are shown in the center of the above image.
        //The skylines when viewed from each cardinal direction are drawn in red.
        //The grid after increasing the height of buildings without affecting skylines is:
        //gridNew = [ [8, 4, 8, 7],
        //            [7, 4, 7, 7],
        //            [9, 4, 8, 7],
        //            [3, 3, 3, 3] ]
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        int[] maxrow = new int[n];
        int[] maxcol = new int[m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                maxrow[i] = Math.max(maxrow[i], grid[i][j]);
                maxcol[j] = Math.max(maxcol[j], grid[i][j]);
            }
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                count += (Math.min(maxrow[i], maxcol[j]) - grid[i][j]);

        return count;
    }
}
