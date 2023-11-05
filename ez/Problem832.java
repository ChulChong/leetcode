import java.util.Arrays;

public class Problem832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
        //https://leetcode.com/problems/flipping-an-image/
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int len = image[0].length;
        for (int i = 0; i < len; i++) {
            image[i] = reverse(image[i]);
            image[i] = invert(image[i]);
        }

        return image;
    }

    public static int[] reverse(int[] image) {
        int len = image.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = image[i];
            image[i] = image[image.length - i - 1];
            image[image.length - i - 1] = temp;
        }

        return image;
    }

    public static int[] invert(int[] image) {
        for (int i = 0; i < image.length; i++) {
            if (image[i] == 1) {
                image[i] = 0;
            } else {
                image[i] = 1;
            }
        }
        return image;
    }
}
