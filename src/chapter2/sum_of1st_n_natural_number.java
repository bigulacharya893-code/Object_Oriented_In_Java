package chapter2;
import java.util.Scanner;
public class sum_of1st_n_natural_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int i=1, sum=0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 1st n natural number is: "+sum);
    }
}
