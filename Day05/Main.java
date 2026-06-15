// package Day05;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args){
//         try{
//             File f=new File("demo.txt");
//             if(f.createNewFile()){
//                  System.out.println("File created successfully");
//             }else{
//                  System.out.println("File already exists");
//             }

//         }
//         catch(IOException e){
//             System.out.println("Error occurred");
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         try{
//             FileWriter fw=new FileWriter("demo.txt");
//             fw.write("Hello Ganesh");
//             fw.close();
//             System.out.println("Data written");
//         }
//         catch(IOException e){
//              System.out.println("Error occurred");
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args){
//        try{
//           File f = new File("demo.txt");
//           Scanner sc=new Scanner(f);
//           while (sc.hasNextLine()) {
//             String data=sc.nextLine();
//             System.out.println(data);
//           }
//           sc.close();
//        } catch(FileNotFoundException e){
//         System.out.println("File not found");

//        }
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         File f=new File("demo.txt");
//         if(f.delete()){
//              System.out.println("File deleted");
//         }else{
//              System.out.println("File not found");
//         }
//     }
// }
/*Quick File Handling Cheat Sheet
Create File Object
File f = new File("demo.txt");

Creates a file reference/object.

Create Actual File
f.createNewFile();

Creates the real file.

Write File
FileWriter fw = new FileWriter("demo.txt");

fw.write("Hello Ganesh");

fw.close();

Writes data into the file.

Read File
Scanner sc = new Scanner(f);

while(sc.hasNextLine()){
    System.out.println(sc.nextLine());
}

Reads file content line by line.

Delete File
f.delete();

Deletes the file.*/