public class remaindersame {
    public int max(int a, int b) {
        if(a == b){
            return 0;
        }
        return (a % 5 == b % 5)? Math.min(a, b): Math.max(a, b);
    }
    public static void main(String args[]) {
        remaindersame num= new remaindersame();

        System.out.println(num.max(2,2));
    }
}
