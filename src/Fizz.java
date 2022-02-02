public class Fizz {
    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.startsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }
    public static void main(String args[]) {
        Fizz num= new Fizz();

        System.out.println(num.fizzString("follow"));
    }

}
