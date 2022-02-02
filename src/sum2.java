import java.util.Scanner;

public class sum2{
    public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:  ");
        Integer a = scan.nextInt();
        System.out.println("Enter the second Number:  ");
        Integer b = scan.nextInt();
        System.out.println("Enter the third Number:  ");
        Integer c = scan.nextInt();

        if ((a == 13)){
            System.out.println("Sum is "+"" + sum);
        }
        if ((b==13))
        {
            sum=sum+a;
            System.out.println("Sum is "+"" + sum);
        }
        if((c==13))
        {
            sum=sum+a+b;
            System.out.println("Sum is "+"" + sum);
        }


    }
}
