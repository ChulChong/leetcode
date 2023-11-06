public class Fibonacci {
    public static void main(String[] args) {


        //1,1,2,3,5,8,13,21....

        fibonacci();

    }

    public static void fibonacci() {


        int first = 0;
        int second = 1;
        int temp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(temp);
            temp = first + second;
            first = second;
            second = temp;
        }

    }


}
