import java.util.Scanner;

public class teen{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        int a=0;
        int b=0;
        int c=0;
        int sum=0;


        System.out.println("Enter the first teenager age:  ");
        Integer teen1 = scan.nextInt();
        System.out.println("Enter the second teenager age:  ");
        Integer teen2 = scan.nextInt();
        System.out.println("Enter the third teenager age:  ");
        Integer teen3 = scan.nextInt();

        if ((teen1>=13 && teen1<=19)  ) {
            if ((teen1 == 15) || (teen1 == 16)) {
                System.out.println("Not a teen");
                a += teen1;
            }
        }
            System.out.println("First teenager is a teen of age: " + teen1);
        if(((teen1>=0) && (teen1<13))||(teen1>=20))
        {
            System.out.println("Not a teen");
            a+=teen1;
        }



        if ((teen2>=13) && (teen2<=19) ) {
            if ((teen2 == 15) || (teen2 == 16) ) {
                System.out.println("Not a teen");
                b+=teen2;
            }

            System.out.println("Second teenager is a teen of age: "+ teen2);
        }
        System.out.println("First teenager is a teen of age: " + teen1);
        if(((teen2>=0 && teen2<13))||(teen2>=20))
        {
            System.out.println("Not a teen");
            b+=teen2;
        }
       if ((teen3>=13 && teen3<=19) ) {
            if ((teen3 == 15) || (teen3 == 16) ) {
                System.out.println("Not a teen");
                c+=teen3;
            }

            System.out.println("Third teenager is a teen of age: "+ teen3);


        }

        if(((teen3>=0 && teen3<13))||(teen3>=20))
        {
            System.out.println("Not a teen");
            c+=teen3;
        }

        sum=a+b+c;
        System.out.println("The sum of teen age is  " + "  "+ sum);


    }
}
