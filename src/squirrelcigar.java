

public class squirrelcigar {
    public static boolean cigarParty(int cigars, boolean isWeekend)
    {
        boolean weekendStatus = isWeekend;
        boolean result= true;

        if ((weekendStatus == false)&&((cigars >=40 )&& (cigars > 60))){
            result = false;
        }

        else if ((cigars>=40)  &&(weekendStatus == true)){
            result = true;
        }
        else if ((cigars < 40)&&(weekendStatus == true)){
            result = false;
        }
        return result;
    }

    public static void main(String args[]) {
        boolean c =cigarParty(40, false);
        System.out.println(c);
    }
}
