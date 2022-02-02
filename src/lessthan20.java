public class lessthan20 {
    public boolean less20(int n) {

        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;

    }
    public static void main(String args[]) {
       lessthan20 nums= new lessthan20();

        System.out.println(nums.less20(38));
    }
}
