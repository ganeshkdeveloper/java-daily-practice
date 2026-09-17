package Day941709;

// public class Main {
//     static int add(int a, int b){
//         return a+b;
//     }
//     static int add(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args){
//         System.out.println(add(10,20));
//         System.out.println(add(10,20,30));
//     }
// }

// public class Main{
//     static int multiply(int a, int b){
//         return a*b;
//     }
//     static int multiply(int a, int b, int c){
//         return a*b*c;
//     }
//     public static void main(String[] args){
//         System.out.println(multiply(2, 3));
//           System.out.println(multiply(2, 3,4));
//     }
// }
// public class Main{
//     static int add(int a, int b){
//         return a+b;
//     }
//     static double add(double a, double b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(10,20));
//         System.out.println(add(10.5,20.5));
//     }
// }
// public class Main{
//     static int square(int number){
//         return number*number;
//     }
//     static double square (double number){
//         return number*number;
//     }
//     public static void main(String[] args){
//         System.out.println(square(5));
//         System.out.println(square(5.5));
//     }
// }
// public class Main{
//     static void showNumber(){
//         int number = 100;
//         System.out.println(number);
//     }
//     public static void main(String[] args){
//         showNumber();
//     }
// }
// public class Main{
//     static void display(){
//         System.out.println("Java");
//     }
//     public static void main(String[] args){
//         display();
//     }
// }
// public class Main {
//     static void student(String name, int age){
//         String course="Java";
//         System.out.println("Name: "+name);
//         System.out.println("Age: "+age);
//         System.out.println("Course: "+course);
//     }
//      public static void main(String[] args){
//         student("Ganesh",26);
//      }
// }
// public class Main{
//     static  void changeNumber(int number){
//         number=50;
//     }
//     public static  void main(String[] args){
//         int number=10;
//         changeNumber(number);
//         System.out.println(number);
//     }
// }
/**
 * Main
 */
// public class Main {
//     static  void changeNumber(int number){
//         number=100;
//     } 
//     public static void main(String[] args) {
//         int number=20;
//         changeNumber(number);
//         System.out.println(number);
//     }
// }
/**
 * Main
 */
// public class Main {
//     static  void display(int number, String name){
//         System.out.println(number+" "+name);
//     }
//     static  void display(String name, int number){
//         System.out.println(name+" "+number);
//     }
//     public static void main(String[] args) {
//         display(26,"Ganesh");
//         display("Ganesh",26);
//     }
// }
/**
 * Main
 */
public class Main {
    static  void show(int age, String name){
        System.out.println(age+" "+name);
    }
    static  void show(String name, int age){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        show(26, "Ganesh");
        show("Ganesh", 26);
    }
}