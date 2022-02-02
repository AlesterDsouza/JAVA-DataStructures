public class increasingorder{

    public boolean Order(int a, int b, int c, boolean equalOk) {

        if (!equalOk && a < b && b < c)

        return true;

        if (equalOk && a <= b && b <= c)

        return true;

  else

        return false;

    }
    public static void main(String args[]) {
        increasingorder  num= new increasingorder();

        System.out.println(num.Order(2,2,4,true));
    }


}