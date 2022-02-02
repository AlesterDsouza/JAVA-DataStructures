import java.util.Scanner;

//public class age {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Long age = scan.nextLong();
//
//        if (age < 18) {
//            System.out.println("Young");
//        }
//        if (age >= 18 && age <= 25) {
//            System.out.println("Young adulthood");
//        }
//        if (age > 25) {
//            System.out.println("Later adulthood");
//        }
//
//    }
//}

//public class age {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Long age = scan.nextLong();
//
//        if (age < 18) {
//            System.out.println("Young");
//        }
//        else if (age >= 18 && age <= 25) {
//            System.out.println("Young adulthood");
//        }
//        else if (age > 25) {
//            System.out.println("Later adulthood");
//        }
//
//    }
//}

public class age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long age = scan.nextLong();

        if (age < 18) {
            System.out.println("Young");
        }
        else if(age >= 18 && age <= 25) {
            System.out.println("Young adulthood");
        }
        else {

            System.out.println("Later adulthood");
        }

    }
}