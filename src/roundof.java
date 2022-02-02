
public class roundof{
    public int roundof(int a, int b, int c) {
        int sum = 0;
        sum += round10(a);
        sum += round10(b);
        sum += round10(c);
        return sum;
    }
    public int round10(int num) {
        if (num % 10 >= 5) {
            num += 10 - num % 10;
        }
        if (num % 10 < 5) {
            num -= num % 10;
        }
        return num;
    }
    public static void main(String args[])

            {
                roundof round= new roundof();
;             System.out.println(round.roundof(15,16,17));
            }
            }



