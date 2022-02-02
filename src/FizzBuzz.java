public class FizzBuzz {
    public String fizz(int n) {
        if (n % 5 == 0 && n % 3 == 0) return "FizzBuzz";
        else if (n % 5 == 0 && n % 3 != 0) return "Buzz";
        else if (n % 5 != 0 && n % 3 == 0) return "Fizz";
        else return n + "!";
    }
    public static void main(String args[]) {
        FizzBuzz num= new FizzBuzz();

        System.out.println(num.fizz(2));
    }
}
