import java.util.Scanner;

public class costdiscount {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Long cost = scan.nextLong();


        if (cost >20000)
        {

            System.out.println("Discount is " + " " + cost*0.8 + "rupees" );
        }
        else if(cost >5000 && cost<=20000)
        {
            System.out.println("Discount is " + " "+ cost * 0.85+ "rupees");
        }
        else if(cost<=5000){
            System.out.println("Discount is " + " "+ cost * 0.90 + "rupees");
        }

    }
}
