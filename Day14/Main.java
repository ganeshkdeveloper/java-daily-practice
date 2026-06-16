package Day14;
// class Student{
//     String name = "Ganesh";
// }
// public class Main {
// public static void main(String[] args) {
//     Student s=new Student();
//     System.out.println(s.name);
// }
    
// }
// class Student{
//     void study(){
//          System.out.println("Studying Java");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Student s=new Student();
//         s.study();
//     }
// }
    // class Student{
    // Student(){
    //     System.out.println("Student Created");
    // }
    // }
    // public class Main {
    //     public static void main(String[] args){
    //         Student s=new Student();
            
    //     }
        
    // }

// class Student{
//     String name;
//     Student(String name){
//         this.name=name;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Student s=new Student("Ganesh");
//         System.out.println(s.name);
//     }
// }

// class Student{
//     private String name;
//     public void setName(String name){
//         this.name=name;
//     }
//     public String getName(){
//         return name;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Student s=new Student();
//         s.setName("Ganesh");
//         System.out.println(s.getName());
//     }
// }
// class Animal{
//     void sound(){
//          System.out.println("Animal Sound");
//     }
// }
// class Dog extends Animal{

// }
// public class Main {
// public static void main(String[] args) {
//     Dog d=new Dog();
//     d.sound();
// }
    
// }
// class Animal{
//     void sound(){
//           System.out.println("Animal Sound");
//     }
// }
// class Dog extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Dog Barks");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Animal a=new Dog();
//         a.sound();
//     }
// }

// class Animal{
//     void sound(){
//           System.out.println("Animal Sound");
//     }
// }
// class Dog extends Animal{
//     @Override
//     void sound(){
//         super.sound();
//         System.out.println("Dog Barks");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.sound();
//     }
// }

// class Person{
//     String name="Ganesh";
//     class Details{
//         void show(){
//              System.out.println(name);
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Person p=new Person();
//         Person.Details d=p.new Details();
//         d.show();
//     }
// }
// abstract class Vehicle{
//     abstract void start();
// }
// class Car extends Vehicle{
//     @Override
//     void start(){
//          System.out.println("Car Started");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Car c=new Car();
//         c.start();
//     }
// }
// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     public void sound(){
//         System.out.println("Dog Barks");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.sound();
//     }
// }
// class Vehicle{
//     void start(){
//         System.out.println("Vehicle Started");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Vehicle v=new Vehicle(){
//             @Override
//         void start(){
//             System.out.println("Car Started");
//         }
        
//         };
//         v.start();
//     }
// }
    // enum Status{
    //     PENDING,
    //     APPROVED,
    //     REJECTED
    // }
    // public class Main {

    //     public static void main(String[] args) {
    //         Status s=Status.APPROVED;
    //         System.out.println(s);
    //     }
    // }