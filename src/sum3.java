import java.util.Scanner;
//
//public class sum3{
//    public static void main(String[] args){
//        int sum=0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the first teen age:  ");
//        Integer a = scan.nextInt();
//        System.out.println("Enter the second teen age:  ");
//        Integer b = scan.nextInt();
//        System.out.println("Enter the third teen age:  ");
//        Integer c = scan.nextInt();
//
//        if ((a == 13) || (a == 14) || (a == 17) || (a == 18) || (a == 19)){
//            System.out.println("Is a teen");
//            a=0;
//        }
//        if ((b == 13) || (b == 14) || (b == 17) || (b == 18) || (b == 19))
//        {
//            System.out.println("Is a teen");
//            b=0;
//        }
//        if((c== 13) || (c == 14) || (c == 17) || (c == 18) || (c== 19))
//        {
//            System.out.println("Is a teen");
//            c=0;
//        }
//    }
//}
public class sum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first teen age:  ");
        Integer a = scan.nextInt();
        System.out.println("Enter the second teen age:  ");
        Integer b = scan.nextInt();
        System.out.println("Enter the third teen age:  ");
        Integer c = scan.nextInt();

        System.out.println("Addition : " + sum(a, b, c));
    }

    public static int sum( int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n >= 13) && (n <= 19) && (n != 15) && (n != 16)) {
            return 0;
        } else {
            return n;
        }
    }
}