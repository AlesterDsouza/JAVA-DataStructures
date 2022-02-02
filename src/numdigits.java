public class numdigits {
    public int sum(int a, int b) {
        String str = Integer.toString(a+b);
        String str2 = Integer.toString(a);

        if(str.length() == str2.length())
        return a+b;
else
        return a;
    }
    public static void main(String args[]) {
       numdigits num= new numdigits();

        System.out.println(num.sum(12,24));
    }

}
