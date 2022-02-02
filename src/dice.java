public class dice {
    public int dies(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == 6)
                die1 = 1;
            else if (die1 == die2)
                die1 += 1;
        }
        return die1 + die2;
    }
    public static void main(String args[]) {
       dice num= new dice();

        System.out.println(num.dies(2,2,true));
    }
}
