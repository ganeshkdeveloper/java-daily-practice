// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//     }
// }
/**
 * Main
 */
// class Student{
//     String name;
// }
// public class Main {

//     public static void main(String[] args) {
//         Student student=new Student();
//         student.name="Ganesh";
//         System.out.println(student.name);
//     }
// }
/**
 * Main
 */
// class Student{
//     String name;
//     int age;
//     double marks;
// }
// public class Main {

//     public static void main(String[] args) {
//         Student student=new Student();
//         student.name="Ganesh";
//         student.age=26;
//         student.marks=85.5;
//         System.out.println("Name: "+student.name);
//         System.out.println("Age: "+student.age);
//         System.out.println("Marks: "+student.marks);
//     }
// }
/**
 * Main
 */
class Student{
    String name;
    int age;
    void introduce(){
        System.out.println("My name is "+ name + " and I am "+age+ " years old.");
    }
}
public class Main {

    public static void main(String[] args) {
        Student student=new Student();
        student.name="Ganesh";
        student.age=26;
        student.introduce();
    }
}