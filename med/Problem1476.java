public class Problem1476 {

    public static void main(String[] args) {
        int[][] rectangle = {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}};

        SubrectangleQueries obj = new SubrectangleQueries(rectangle);
        System.out.println(obj.getValue(0, 2));
        obj.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(obj.getValue(0, 2));
        System.out.println(obj.getValue(3, 1));
        obj.updateSubrectangle(3, 0, 3, 2, 10);
        System.out.println(obj.getValue(3, 1));
        System.out.println(obj.getValue(0, 2));
        //expected output
        //[null,1,null,5,5,null,10,5]
        //Explanation
        //SubrectangleQueries subrectangleQueries = new SubrectangleQueries([[1,2,1],[4,3,4],[3,2,1],[1,1,1]]);
        //// The initial rectangle (4x3) looks like:
        //// 1 2 1
        //// 4 3 4
        //// 3 2 1
        //// 1 1 1
        //subrectangleQueries.getValue(0, 2); // return 1
        //subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        //// After this update the rectangle looks like:
        //// 5 5 5
        //// 5 5 5
        //// 5 5 5
        //// 5 5 5
        //subrectangleQueries.getValue(0, 2); // return 5
        //subrectangleQueries.getValue(3, 1); // return 5
        //subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        //// After this update the rectangle looks like:
        //// 5   5   5
        //// 5   5   5
        //// 5   5   5
        //// 10  10  10
        //subrectangleQueries.getValue(3, 1); // return 10
        //subrectangleQueries.getValue(0, 2); // return 5
    }
}

class SubrectangleQueries {

    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}