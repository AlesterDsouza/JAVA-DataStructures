public class rightmostdigit {
    public boolean lastDigit(int a, int b, int c) {

        int modA = a % 10;

        int modB = b % 10;

        int modC = c % 10;



        if (modA == modB || modA == modC || modB == modC)

        return true;

  else

        return false;

    }
    public static void main(String args[]) {
        rightmostdigit num= new rightmostdigit ();

        System.out.println(num.lastDigit(3,9,4));
    }
}
