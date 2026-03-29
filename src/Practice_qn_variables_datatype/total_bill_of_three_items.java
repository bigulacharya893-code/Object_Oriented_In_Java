package Practice_qn_variables_datatype;
import java.util.Scanner;
public class total_bill_of_three_items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();
        float total_cost = (pen+pencil+eraser);
        System.out.println("Your total bill for all three items is: "+total_cost);
        float gst_amt = ((0.18f)*total_cost);
        float final_cost = (total_cost+gst_amt);
        System.out.println("Final cost after gst is "+final_cost);
    }
}
