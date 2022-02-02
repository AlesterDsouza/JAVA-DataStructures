public class ten {
    public boolean lessBy10(int a, int b, int c) {
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        int dif = max - min;
        if (dif >= 10) return true;
        else return false;
    }
    public static void main(String args[]) {
      ten  num= new ten();

        System.out.println(num.lessBy10(2,2,4));
    }
}
