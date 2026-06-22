package Day26;
// public class Main {
//     static int countNumbersLessThanZero(int[] arr){
//         int count=0;
//         for(int num:arr){
//             if(num<0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, -2, 8, -7, 10, -1};
//         System.out.println(countNumbersLessThanZero(arr));
//     }
// }

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// import java.util.ArrayList;
// import java.util.HashMap;

// public class Main {
// static int countNumbersEqualToTen(int[] arr){
//     int count=0;
//     for(int num:arr){
//         if(num==10){
//             count++;
//         }
//     }
//     return count;
// }
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 10, 8, 10, 3};
//         System.out.println(countNumbersEqualToTen(arr));
//     }
// }
// class Student{
//     private int id;
//     private String name;
//     public void setId(int id){
//         this.id=id;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
// }}
// public class Main {

//     public static void main(String[] args) {
//         Student s=new Student();
//         s.setId(101);
//         s.setName("Ganesh");
//         System.out.println(s.getId());
//         System.out.println(s.getName());
//     }
// }
// class Animal{
//     void sound(){
//          System.out.println("Animal makes sound");
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
//         Dog d=new Dog();
//         d.sound();
//     }
// }

// class Animal{
//     void sound(){
//          System.out.println("Animal makes sound");
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
// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     public void sound(){
//           System.out.println("Dog Barks");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Animal a=new Dog();
//         a.sound();
//     }
// }
// public class Main {

//     public static void main(String[] args) {
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

//     public static void main(String[] args) {
//         HashMap<Integer,String> students=new HashMap<>();
//         students.put(101, "Ganesh");
//         students.put(102, "Java");
//         students.put(103, "Python");
//         System.out.println(students.get(101));
//         System.out.println(students.get(102));
//         System.out.println(students.get(103));
//     }
// }
// public class Main {

    
//     public static void main(String[] args) {
//         try {
//             File f=new File("demo.txt");
//             if(f.createNewFile()){
//                   System.out.println("File created");
//             }else{
//                   System.out.println("File already exists");
//             }
//         } catch (Exception e) {
//            System.out.println(e);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         try {
//             FileWriter fw=new FileWriter("demo.txt");
//             fw.write("Hello Ganesh");
//             fw.close();

//             System.out.println("Data written");
//         } catch (Exception e) {
//           System.out.println(e);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         try {
//             FileWriter fw=new FileWriter("demo.txt",true);
//             fw.write("\nJava JDBC");
//             fw.close();
//             System.out.println("Data Appended");
//         } catch (Exception e) {
//              System.out.println(e);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         try {
//             File f=new File("demo.txt");
//             Scanner sc=new Scanner(f);
//             while (sc.hasNextLine()) {
//                 System.out.println(sc.nextLine());
//             }
//             sc.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         File f=new File("demo.txt");
//         if(f.delete()){
//             System.out.println("File deleted");
//         }else{
//             System.out.println("File not Found");
//         }
//     }
// }