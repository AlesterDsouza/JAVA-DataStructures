public class sum2numbers {
    public int Sum(int a, int b) {
        int sum = a + b;

        if ( sum >= 10 && sum <= 19 )
            return 20;
        else
            return sum;
    }
    public static void main(String args[])

    {
        sum2numbers nums = new sum2numbers();

        System.out.println(nums.Sum(10,2));
    }
}
