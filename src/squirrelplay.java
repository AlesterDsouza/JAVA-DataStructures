public class squirrelplay{
    public static boolean temperature(int temperature, boolean summer)
    {
        boolean isSummer = summer;
        boolean result= true;

        if ((isSummer == false)&&((temperature >=60 )&& (temperature <= 90))){
            result = false;
        }

        else if (((temperature>=40)&& (temperature <= 100))  &&(isSummer == true)){
            result = true;
        }
        return result;
    }
    public static void main(String args[]) {
        boolean t =temperature(90, false);
        System.out.println(t);
    }
}