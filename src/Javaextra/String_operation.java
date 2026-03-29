package Javaextra;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class String_operation {
    public static void main(String[] args){
        // concatinate
        String name1="Beecool";
        String name2="Acharya";
        String name3=name1 + name2;
        System.out.println(name3);
        System.out.println(name1 +" and "+ name2);

        // charAt
        System.out.println(name3.charAt(0));
        System.out.println(name3.charAt(7));

        //length
        System.out.println(name3.length());

        //replace
        System.out.println(name3.replace('e','i'));
        System.out.println(name3);// no change in original name

        //substring
        String substring = name3.substring(0,4);
        System.out.println(substring);

    }
}
