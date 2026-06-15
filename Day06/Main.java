package Day06;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// public class Main {
//     public static void main(String[] args){
//         try{
//             FileInputStream fis=new FileInputStream("Day06/demo.txt");
//             int data=fis.read();
//             System.out.println((char)data);
//             fis.close();
//         }catch(IOException e){
//             System.out.println("Error");
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args){
//         try{
//             FileOutputStream fos = new FileOutputStream("Day06/demo.txt");

//             fos.write('A');

//             fos.close();

//             System.out.println("Data written");
//         }catch(IOException e){
//              System.out.println("Error");
//         }
//     }
// }
// public class Main {

//      public static void main(String[] args){
//         try{
//             BufferedReader br=new BufferedReader (new FileReader("Day06/demo.txt"));
//             String line=br.readLine();
//             System.out.println(line);
//             br.close();
//         }catch(IOException e){
//               System.out.println("Error");
//         }
//      }
// }
// public class Main {

//     public static void main(String[] args){
//        try{
//          BufferedWriter bw=new BufferedWriter((new FileWriter("Day06/demo.txt")));
//         bw.write("Hello Ganesh");
//         bw.close();
//         System.out.println("Data Written");
//        }catch(IOException e){
//         System.out.println("Error");
//        }
//     }
// }
/*
Quick I/O Streams Cheat Sheet
FileInputStream

Read bytes from a file.

FileInputStream fis = new FileInputStream("demo.txt");

int data = fis.read();

fis.close();
FileOutputStream

Write bytes to a file.

FileOutputStream fos = new FileOutputStream("demo.txt");

fos.write('A');

fos.close();
BufferedReader

Read text line by line.

BufferedReader br =
    new BufferedReader(
        new FileReader("demo.txt")
    );

String line = br.readLine();

br.close();
BufferedWriter

Write text efficiently.

BufferedWriter bw =
    new BufferedWriter(
        new FileWriter("demo.txt")
    );

bw.write("Hello Ganesh");

bw.close();
*/
