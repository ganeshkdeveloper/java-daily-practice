package Day09;
// import java.util.regex.*;
// public class Main {
//     public static void main(String[] args){
//         Integer num=100;
//         System.out.println(num);
//         ArrayList<Integer> numbers=new ArrayList<>();
//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);
//         System.out.println(numbers);
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         int a=10;
//         Integer b=a;
//         int c=b;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         ArrayList<String> names=new ArrayList<>();
//         names.add("Ganesh");
//         names.add("Java");
//         names.add("Python");
//         for(String name:names){
//             System.out.println(name);
//         }
//     }
// }
// public class Main {
//         static <T> void printData(T data){
//             System.out.println(data);
//         }
//     public static void main(String[] args){
//             printData("Ganesh");
//             printData(100);
//             printData(99.5);
//     }
// }
// class Vehicle{
//     void start(){
//         System.out.println("Vehicle Started");
//     }
// }
// class Car extends Vehicle{
//     @Override
//     void start(){
//         System.out.println("Car Started");
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         Car c=new Car();
//         c.start();
//     }
// }

/*Regex
public class Main {

    public static void main(String[] args){
        String text="12345";
        boolean result=Pattern.matches("[0-9]+",text);
        System.out.println(result);
    }
}*/

//Threads
// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Thread running");
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         MyThread t1=new MyThread();
//         MyThread t2=new MyThread();
//         t1.start();
//         t2.start();
//         System.out.println("Main Method");
//     }
// }