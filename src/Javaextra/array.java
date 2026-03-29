package Javaextra;

import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int age = 30;
        System.out.println(age);
       int[] marks = new int[10]; // or int marks[] = new int[10];
        marks[0]=93;
        marks[1]=34;
        marks[2]=44;
        marks[3]=40;
        marks[4]=44;
        marks[5]=55;
        System.out.println(marks[5]);
        char[] arr = {'B','E','I','C','O','O','L'};
        System.out.println(arr[2]);
        //length
        System.out.println(arr.length);// no length() function used in array

        //sort
        // before sorting
        System.out.println(marks[5]);
        Arrays.sort(marks);
        // after sorting
        System.out.println(marks[5]);

        //2d array
        int[][] finalMarks = {{97, 98, 95},{95, 55, 98}};
        System.out.println(finalMarks[0][2]);
        System.out.println(finalMarks[1][2]);
    }
}
