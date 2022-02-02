public class lotteryticket2 {
    public int greenTicket(int a, int b, int c) {

        if (a == b && b == c)

        return 20;

        if (a == b || a == c || b == c)

        return 10;

  else;

        return 0;

    }
    public static void main(String args[]) {
        lotteryticket2 num= new lotteryticket2();

        System.out.println(num.greenTicket(2,2,3));
    }

}
