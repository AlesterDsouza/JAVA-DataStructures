import java.util.Scanner;

public class librarybookcharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long days = scan.nextLong();

        if (days >= 1 && days <= 7) {
            System.out.println("Charge is " + " " + 5 * days + "rupees");
        }
        else if (days >= 8 && days <= 15) {
            System.out.println("Charge is " + " " + 15 * days  + "rupees");
        }
        else if (days >= 16 && days <= 21) {
            System.out.println("Charge is " + " " + 30 * days  + "rupees");
        }
        else if (days >= 21) {
            System.out.println("Charge is " + " " + 40 * days  + "rupees");
        }

    }
}
