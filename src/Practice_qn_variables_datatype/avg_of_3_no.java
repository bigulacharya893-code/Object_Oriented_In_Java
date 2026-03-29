package Practice_qn_variables_datatype;
import java.util.Scanner;
public class avg_of_3_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers separated by spaces: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
