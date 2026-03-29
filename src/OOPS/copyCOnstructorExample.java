package OOPS;

public class copyCOnstructorExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ram",45);
        t1.name = "Ram";
        t1.roll = 45;
        Teacher t2 = new Teacher(t1);
        System.out.println(t2.name);
        System.out.println(t2.roll);
    }
}
class Teacher{
    String name;
    int roll;
    // copy constructor
    Teacher(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    // copy constructor
    Teacher(Teacher t1){
        this.name = t1.name;
        this.roll = t1.roll;
    }
}
