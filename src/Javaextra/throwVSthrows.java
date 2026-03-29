package Javaextra;

public class throwVSthrows {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        checkAge(19);
    }
}

