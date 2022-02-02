import java.util.Scanner;

public class police {
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
            else if(Speed>60 && Speed<=80)
            {
                if(IsBirthDay)
                {
                    if(Speed<=65)
                    {
                        System.out.println("Result : 0");
                    }
                    else{
                        System.out.println("Result : 1");
                    }
                }
                else
                {
                    System.out.println("Result : 1");
                }
            }
            else if(Speed>80)
            {
                if(IsBirthDay)
                {
                    if(Speed<=85)
                    {
                        System.out.println("Result : 1");
                    }
                    else{
                        System.out.println("Result : 2");
                    }
                }
                else
                {
                    System.out.println("Result : 2");
                }
            }

        }
    }