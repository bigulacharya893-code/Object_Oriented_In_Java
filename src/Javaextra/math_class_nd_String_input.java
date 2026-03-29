package Javaextra;
import java.util.Scanner;
public class math_class_nd_String_input {
    public static void main(String[] args) {
        System.out.println(Math.min(5,6));
        System.out.println(Math.max(2,8));
        // function in side Math class: random
        System.out.println(Math.random());
        System.out.println((int)Math.random());
        System.out.println((int)(Math.random()*100));
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.next();
//        System.out.println(name);
        // to print more than one word use nextLine
        System.out.println("Enter your full name: ");
        String name1 = sc.nextLine();
        System.out.println(name1);
    }
}
