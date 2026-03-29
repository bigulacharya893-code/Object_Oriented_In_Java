package chapter2;
import java.util.Scanner;

public class branching_statements {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            if(i==3)
                break;
            System.out.println(i);
        }
        System.out.println("After loop");
        for (int i = 0; i < 10; i++) {
            if(i>3 && i<9)
                continue; // break or terminate if condition is true and executes next but don't stop like break
            System.out.println(i);
        }
        System.out.println("After continue");

        // for-each

    }
}
