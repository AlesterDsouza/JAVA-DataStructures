public class sumthird {
    public boolean twoOne(int a, int b, int c) {
        return (a == b + c) || (b == c + a) || (c == a + b);
    }
    public static void main(String args[]) {
        sumthird num= new sumthird();

        System.out.println(num.twoOne(2,2,4));
    }
}
