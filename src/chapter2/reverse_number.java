package chapter2;

public class reverse_number {
    public static void main(String[] args) {
        int n = 1001, org_num = n, rev=0, rem;
                while(n!=0) {
                    rem = n % 10;
                     rev= rev * 10 + rem;
                    n = n / 10;
                }
        System.out.println("Reverse of n is: "+rev);
         // Palindrome number check
        if(org_num == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
