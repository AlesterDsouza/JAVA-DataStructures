import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            boolean is = Armstrong(i);
            if (is) {
                System.out.println(i);


            }
        }
    }


    public static boolean Armstrong(int x) {
        int tmp;
        int cube = 1;
        int sum = 0;
        int count = 1;
        int m;
        m = x;


        while (m > 0) {
            tmp = m % 10;
            for (int p = 1; p <= 3; p++) {
                cube  = cube * tmp;
            }
            sum = sum + cube;

            cube=1;
            m = m / 10;
        }

        if (x == sum) {
            return true;
        } else {
            return false;
        }

    }
}


















