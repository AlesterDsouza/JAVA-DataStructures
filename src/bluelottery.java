public class bluelottery {
    public int blue(int a, int b, int c) {

        int ab = a + b;

        int bc = b + c;

        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10)

        return 10;

        if (ab - bc == 10 || ab - ac == 10)

        return 5;

  else

        return 0;

    }
    public static void main(String args[]) {
        bluelottery num= new bluelottery();

        System.out.println(num.blue(2,2,2));
    }
}
