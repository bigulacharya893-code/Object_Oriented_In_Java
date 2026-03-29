package chapter2;

import java.util.Scanner;

public class loops_example {
    public static void main(String[] args){
        int count = 0;
        while(count<10){
            System.out.println("Hello Becool!");
            count++;
        }
        // printing even number
        for (int i = 0; i < 10; i++) {
            if(i%2==0)
                System.out.println(i);
        }
//        // to print numbers from 1 to n
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("i= "+i);
            i++;
        }
        // for-each loop example
        int[] num = {11,22,34,55,72,89};
        for(int i1: num){
            System.out.println(i1);
        }
        char[] vowel = {'a','e','i','o','u'};
        for(char j : vowel){
            System.out.println(j);
        }
        // to find sum of no from o to b
        int a = 0;
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        int sum1=0;
        do {
           sum1=sum1+a;
           a++;
        }while(a<=b);
        System.out.println(sum1);

        int nn = 0;
        do {
            System.out.println(("Enter your number: "));
            nn = sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(nn);
         }while(nn >= 0);
        System.out.println("The End");
    }
}
