public class lotteryticket {
    public int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2)

        return 10;

        if ( a == b && b == c)

        return 5;

        if ( a != b && a != c)

        return 1;

  else

        return 0;

    }
    public static void main(String args[]) {
        lotteryticket num= new lotteryticket();

        System.out.println(num.redTicket(2,2,2));
    }

}
