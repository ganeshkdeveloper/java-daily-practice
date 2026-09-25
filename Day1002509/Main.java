// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello world!");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//         }
//     }
// }
/**
 * Main
 */
// public class Main {
// public static void main(String[] args) {
//     for(int i=20; i>=1; i--){
//         System.out.println(i);
//     }
// }
    
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int sum=0;
//         for(int i=1; i<=20;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=20;i++){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
//         }        
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         //for loop
//         int number = 8;
//         for(int i=1;i<=10;i++){
//             System.out.println(number+" X "+i+" = "+number*i);
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=20;i+=2){
//             System.out.println(i);
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             if(i==7){
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             if(i%2==0){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr={10, 20, 30, 40, 50};
//         System.out.println(arr[0]);
//         System.out.println(arr[4]);

//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr={5, 10, 15, 20, 25};
//         arr[2]=100;
//         System.out.println(arr[2]);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//             int[] arr={10, 20, 30, 40, 50, 60, 70};
//             System.out.println(arr.length);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr={10, 20, 30, 40, 50};
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         // sum of the array
//         int sum = 0;
//         int[] arr = {5, 10, 15, 20, 25};
//         for(int i=0; i<arr.length; i++){
//             sum = sum +arr[i];
//         }
//         System.out.println("Sum: "+sum);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr={12, 45, 7, 89, 34, 56};
//         int max = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("Largest: "+max);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr = {35, 12, 67, 4, 89, 23};
//         int min = arr[0];
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         System.out.println("Samllest: "+min);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr = {10, 25, 40, 55, 70};
//         int search = 55;
//         boolean found = false;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==search){
//                 found=true;
//                 break;
//             }
//         }
//         System.err.println("Found: "+found);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr={5, 10, 5, 20, 5, 30, 40};
//         int count = 0;
//         int search = 5;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==search){
//                 count++;
//             }
//         }
//         System.out.println("Count: "+count);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int[] arr={10, 20, 30, 40, 50, 60};
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.println(arr[i]);
//         }
//     }
// }
/**
 * Main
 */
// import  java.util.Arrays;;
// public class Main {

//     public static void main(String[] args) {
//         int[] original = {10, 20, 30, 40, 50};
//         int[] copy = Arrays.copyOf(original, original.length);
//         System.out.println(Arrays.toString(copy));
//     }
// }
/**
 * Main
 */
// import  java.util.Arrays;;
// public class Main {

//     public static void main(String[] args) {
//         int[] arr = {45, 12, 89, 23, 7, 56};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }