package Javaextra;

public class exception_handling {
    public static void main(String[] args) {
        int[] marks = {33,98,66};
        // TRY - CATCH in exception handling
        try{
            System.out.println(marks[5]);
        }
        catch (Exception exception){
            // do something here
        }
        System.out.println("Hell I am Beecool");
        // But we want this next code to be executed
    }
}
