public class near10 {
    public boolean nearTen(int num) {

        if (num % 10 < 3 || num % 10 >=8)

        return true;

  else return false;

    }
    public static void main(String args[]) {
        near10 nums= new near10();

        System.out.println(nums.nearTen(38));
    }

}
