package leetcode;

public class Fibonacci {
    public static void main(String[] args) {


        //1,1,2,3,5,8,13,21....

        fibonacci();

    }

    public static void fibonacci() {


        int first = 0;
        int second = 1;
        int temp;

        for (int i = 0; i < 10; i++) {
            System.out.println(first);
            temp = second;
            second += first;
            first = temp;
        }

    }


}
