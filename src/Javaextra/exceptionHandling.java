package Javaextra;

public class exceptionHandling {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;// it throws Arithmetic Exception
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
        int arr[] = new int[5];
        arr[10] = 50;
    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
