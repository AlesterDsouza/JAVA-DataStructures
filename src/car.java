import java.util.*;
public class car
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Speed : ");
        int Speed=sc.nextInt();
        System.out.println("Birthday : ");
        boolean IsBirthDay=sc.nextBoolean();
        if(Speed<=60)
        {
            System.out.println("0");
        }
        else if(Speed>=61 && Speed<=80) {
            System.out.println("1");
        }
        else if(Speed>=81) {
            System.out.println("2");
        }
        if(IsBirthDay)
            {
                if(Speed<=65)
                {
                    System.out.println("Result : 0");
                }
                else if(Speed>=66 && Speed<=85){
                    System.out.println("Result : 1");
                }
                else if(Speed>=86)
                {
                    System.out.println("2");
                }

        }

    }
}