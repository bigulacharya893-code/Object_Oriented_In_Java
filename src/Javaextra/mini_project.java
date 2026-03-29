package Javaextra;
import java.util.Scanner;
public class mini_project {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int myNumber = (int)(Math.random()*100);
    int userNumber;
    do{
        System.out.println("Guess my number: ");
        userNumber = sc.nextInt();
        if(myNumber == userNumber){
            System.out.println("Oh Yeah! That's correct number");
            break;
        }
        else if(userNumber > myNumber){
            System.out.println("Your number is too large!");
        }
        else if (userNumber < myNumber){
            System.out.println("Your number is too small!");
        }
    }while(userNumber>=0);
        System.out.println("My number was: ");
        System.out.println(myNumber);
    }
}
