package Day18;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             FileInputStream fis=new FileInputStream("Day18/demo.txt");
//         int data=fis.read();
//         System.out.println((char)data);
//        fis.close();
//         } catch (IOException e) {
//              e.printStackTrace();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         try {
//             FileOutputStream fos=new FileOutputStream("Day18/demo.txt");
//             fos.write('A');
//             fos.close();
//             System.out.println("Data Written");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         try {
//             BufferedReader br=new BufferedReader(new FileReader("Day18/demo.txt"));
//             String line=br.readLine();
//             System.out.println(line);
//             br.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//       try {
//           BufferedWriter bw=new BufferedWriter(new FileWriter("Day18/demo.txt"));
//         bw.write("Hello Ganesh");
//         bw.close();
//         System.out.println("Data Written");
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
//     }
// }