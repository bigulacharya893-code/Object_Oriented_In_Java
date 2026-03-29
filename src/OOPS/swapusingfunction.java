package OOPS;

public class swapusingfunction {
    static void swap(int a, int b){
         int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args){
        int a=4,b=3;
    swap(a,b);
    }
}
