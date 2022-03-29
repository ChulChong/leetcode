import java.util.Arrays;

public class Problem1828 {
    public static void main(String[] args) {

        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        System.out.println(Arrays.toString(countPoints(points, queries)));
        //Expected Output: [3,2,2]

    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int[] query = queries[i];
            for (int[] point : points) {
                int x = point[0] - query[0];
                int y = point[1] - query[1];
                if (x * x + y * y <= query[2] * query[2])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
// Basic Mathematics will tell you that the distance between two points (x1, y1) and (x2, y2) is
// given by - sqrt((x1 - x2)^2 + (y1 - y2)^2).
// We need the distance between the center of the circle and a point less than or equal to
// radius of the circle for it to be considered as a point inside the circle.
// Thus, we need - (circle_center_x - x1) ^ 2 - (circle_center_y - y1) ^ 2 <= r * r for a point to be inside the circle.