package OOPS.Abstraction;

public class AbstractClassExample {
    public static void main(String[] args) {
        Mustang n = new Mustang();
        Horsez h = new Horsez();
        System.out.println(h.color);
    }
}
abstract class Animaliz{
    String color;
    Animaliz(){
        color = "brown";
        System.out.println("Animal constructor called");
    }
    abstract void walk();
}
class Horsez extends Animaliz{
    Horsez(){
        System.out.println("Horsez constructor called");
    }
    void hangeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horsez{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
