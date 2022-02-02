public class multiple3or5 {
    public boolean multiple(int n) {

        return n % 3 == 0 || n % 5 == 0;

    }
    public static void main(String args[]) {
        multiple3or5 nums= new multiple3or5();

        System.out.println(nums.multiple(26));
    }

}
