import java.util.Scanner;

public class sum1{
    public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:  ");
        Integer num1 = scan.nextInt();
        System.out.println("Enter the second Number:  ");
        Integer num2 = scan.nextInt();
        System.out.println("Enter the third Number:  ");
        Integer num3 = scan.nextInt();

        if ((num1 == num2) || (num2==num3) || (num1==num3)){
            System.out.println(" Please input three separate values for num1, num2, num3" );
        }
        if ((num1 == num2)){
            sum=sum+num3;
            System.out.println("Sum is "+"" + sum);
        }
        if ((num2 == num3))
        {
            sum=sum+num1;
            System.out.println("Sum is "+"" + sum);
        }
        if((num1==num3))
        {
            sum=sum+num2;
            System.out.println("Sum is "+"" + sum);
        }
        else if((num1!=num2) || (num2!=num3) || (num3!=num1))
        {
        sum=sum+num1+num2+num3;
            System.out.println("The sum is "+ " " + sum);
        }

    }
}
