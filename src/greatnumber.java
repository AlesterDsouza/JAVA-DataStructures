import java.util.Scanner;

public class greatnumber{
    public static void main(String[] args) {
        int sum=0;
        int diff;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:  ");
        Integer a = scan.nextInt();
        System.out.println("Enter the second Number:  ");
        Integer b = scan.nextInt();

        sum=a+b;
        if((a>b)){
            diff=a-b;
        }
        else
        {
            diff=b-a;
        }
        if((a==6)||(b==6))
        {
            System.out.println("true");
        }
        if(sum==6)
        {
            System.out.println("true");
        }
        if(diff==6)
            System.out.println("true");
    }
}

