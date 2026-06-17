package Day17;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         try {
//             File f=new File("Demo.txt");
//             if(f.createNewFile()){
//                 System.out.println("File created successfully");
//             }else{
//                 System.out.println("File already exists");
//             }
//         } catch (IOException e) {
//            System.out.println("An error occurred.");
//              e.printStackTrace();
//         }
//     }
// }
// public class Main {
// import java.util.Scanner;

//     public static void main(String[] args) {
//         try {
//             FileWriter fw=new FileWriter("demo.txt");
//             fw.write("Hello Ganesh");
//             fw.close();
//             System.out.println("Data Written");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         try {
//             File f=new File("demo.txt");
//             Scanner sc=new Scanner(f);
//             while (sc.hasNextLine()) {
//                 String data=sc.nextLine();
//                 System.out.println(data);
//             }
//             sc.close();
//         } catch (Exception e) {
//            e.printStackTrace();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         File f=new File("demo.txt");
//         if(f.delete()){
//             System.out.println("File Deleted");
//         }else{
//              System.out.println("File not found");
//         }
//     }
// }
