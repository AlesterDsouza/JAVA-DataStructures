import java.util.Scanner;

public class sumrange{
    public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:  ");
        Integer a = scan.nextInt();
        System.out.println("Enter the second Number:  ");
        Integer b = scan.nextInt();

        sum= a+b;
        if((sum>=10) && (sum<=19))
        {
            sum=20;
        }
        System.out.println("Sum is "+ " "+ sum);

    }
}
