public class teensum {
    public int teenSum(int a, int b) {

        int sum = a+b;

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))

        return 19;

  else

        return sum;

    }
    public static void main(String args[]) {
        teensum nums= new teensum();

        System.out.println(nums.teenSum(38,12));
    }

}
