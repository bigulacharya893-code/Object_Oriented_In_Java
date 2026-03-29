package OOPS;

public class class_and_object_eg {
    public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.changeColor("Yellow");
    p1.changeLength(8);
        System.out.println(p1.color);
        System.out.println(p1.length);
        p1.changeColor("Pink");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int length;
    void changeColor(String color){
        this.color = color;
    }
    void changeLength (int length){
        this.length = length;
    }
}


