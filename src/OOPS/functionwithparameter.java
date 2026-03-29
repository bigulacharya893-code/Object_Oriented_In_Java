package OOPS;
import java.util.Scanner;
public class functionwithparameter {
    static int  findSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter value of a: ");
        int a = sc.nextInt();
        System.out.println("ENter value of b: ");
        int b = sc.nextInt();
        int sum = findSum(a, b);
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
    }
}

