// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i<= 20; i++) {
            System.out.println(fizzBuzzMethod(i));
        }
    }
    
    public static String fizzBuzzMethod(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzzsss";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if(num % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}