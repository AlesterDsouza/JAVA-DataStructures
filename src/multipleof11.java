public class multipleof11 {

    public static boolean Eleven(int n) {

        return n % 11 == 0 || n % 11 == 1;

    }
    public static void main(String args[])

    {
        boolean c =Eleven(0);
        System.out.println(c);
    }

}
