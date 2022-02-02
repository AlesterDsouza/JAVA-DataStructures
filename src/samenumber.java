public class samenumber {
    public boolean Digit(int a, int b) {

        int X = a / 10;

        int Y = a % 10;

        int Z = b / 10;

        int S = b % 10;

        if (X == Z || X == S || Y == Z || Y == S)

        return true;

  else

        return false;

    }
    public static void main(String args[]) {
        samenumber num= new samenumber();

        System.out.println(num.Digit(12,24));
    }

}
