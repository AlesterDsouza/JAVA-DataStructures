public class threevariablegreater
{
    public boolean Order(int a, int b, int c, boolean bOk) {
        if(bOk) {
            if (c > b)
            return true;
    else
            return false;

        }

        if (b > a && c > b)

        return true;

  else

        return false;

    }
    public static void main(String args[]) {
        threevariablegreater  num= new threevariablegreater ();

        System.out.println(num.Order(2,2,4,true));
    }

}
