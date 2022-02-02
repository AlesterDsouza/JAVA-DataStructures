import java.util.Scanner;

//public class maxtwonumbers {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the first Number:  ");
//        Integer num1 = scan.nextInt();
//        System.out.println("Enter the second Number:  ");
//        Integer num2 = scan.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("First Number is greater: " + " " + num1);
//        }
//        if (num1 < num2) {
//            System.out.println("Second Number is greater: " + " " + num2);
//        }
//        if ((num1 == num2)) {
//
//            System.out.println("Please enter two separate numbers");
//        }
//
//    }
//}

public class maxtwonumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:  ");
        Integer num1 = scan.nextInt();
        System.out.println("Enter the second Number:  ");
        Integer num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("First Number is greater: " + " " + num1);
        }
        else if (num1 < num2) {
            System.out.println("Second Number is greater: " + " " + num2);
        }
        else if ((num1 == num2)) {

            System.out.println("Please enter two separate numbers");
        }

    }
}

