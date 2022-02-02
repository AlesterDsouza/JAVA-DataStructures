import java.util.Scanner;

public class distance {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Double distance = scan.nextDouble();

        if (distance <=100) {
            System.out.println("Cost is " + " " +200+ "rupees" );
        }
        else if (distance >= 101 && distance <= 500) {
            System.out.println("Cost is " + " " +500 + "rupees" );
        }
        else if (distance >= 501 && distance <= 1000) {
            System.out.println("Cost is " + " " + 1000 + "rupees");
        }
        else if (distance >= 1000 ) {
            System.out.println("Cost is " + " " +2000+ "rupees" );
        }

    }
}
