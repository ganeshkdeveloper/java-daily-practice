package Day65038;
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Enter the number");
//         System.out.println(2+3);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println(2+5);
//         System.out.println(2-5);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Dont Give Up");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Stand alone");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Do work it all day one day result come dont go back");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("All is Well");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Work Hard Like Hell");
//     }
// }

/**
 * Main
 */
// public class Main {
//     static int findSecondLargest(int[] arr){
//         if(arr==null||arr.length<2){
//             return -1;
//         }
//         int largest=Integer.MIN_VALUE;
//         int secondLargest=Integer.MIN_VALUE;
//         for(int num:arr){
//             if(num>largest){
//                 secondLargest=largest;
//                 largest=num;
//             }else if(num>secondLargest&&num!=largest){
//                 secondLargest=num;
//             }
//         }
//         return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
//     }
//     public static void main(String[] args) {
//         int[] arr1 = {10, 20, 30, 40, 50};
//         int[] arr2 = {5, 5, 5};
//         int[] arr3 = {8, 15, 15, 10};
//         System.out.println(findSecondLargest(arr1));
//         System.out.println(findSecondLargest(arr2));
//         System.out.println(findSecondLargest(arr3));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findSecondSmallest(int[] arr){
//         if(arr==null||arr.length<2){
//             return -1;
//         }
//         int smallest=Integer.MAX_VALUE;
//         int SecondSmallest=Integer.MAX_VALUE;
//         for(int num:arr){
//             if(num<smallest){
//                 SecondSmallest=smallest;
//                 smallest=num;
//             }else if(num<SecondSmallest&&num!=smallest){
//                 SecondSmallest=num;
//             }
//         }
//         return(SecondSmallest==Integer.MAX_VALUE)?-1:SecondSmallest;
//     }
//     public static void main(String[] args) {
//         int[] arr1 = {10, 20, 30, 40, 50};
//         int[] arr2 = {5, 5, 5};
//         int[] arr3 = {8, 3, 3, 10, 5};

//         System.out.println(findSecondSmallest(arr1)); 
//         System.out.println(findSecondSmallest(arr2)); 
//         System.out.println(findSecondSmallest(arr3)); 
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findThirdLargest(int[] arr){
//         if(arr==null||arr.length<3){
//             return -1;
//         }
//         int largest=Integer.MIN_VALUE;
//         int secondLargest=Integer.MIN_VALUE;
//         int thirdLargest=Integer.MIN_VALUE;
//         for(int num:arr){
//             if(num>largest){
//                 thirdLargest=secondLargest;
//                 secondLargest=largest;
//                 largest=num;
//             }else if(num>secondLargest&&num!=largest){
//                  thirdLargest = secondLargest;
                //secondLargest = num;
//             }else if(num>thirdLargest&&num!=secondLargest&&num!=largest){
//                 thirdLargest=num;
//             }
//         }
//         return(thirdLargest==Integer.MIN_VALUE)?-1:thirdLargest;
//     }
//     public static void main(String[] args) {
//           int[] arr1 = {10, 20, 30, 40, 50};
//         int[] arr2 = {5, 5, 5};
//         int[] arr3 = {10, 40, 20, 50, 30};

//         System.out.println(findThirdLargest(arr1)); 
//         System.out.println(findThirdLargest(arr2)); 
//         System.out.println(findThirdLargest(arr3)); 
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Heloa");
//     }
// }
/**
 * Main
 */
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new  Scanner(System.in);
//         System.out.println("Enter Number 1");
//         int a=sc.nextInt();
//         System.out.println("You entered "+a);
//         System.out.println("Enter Number 2");
//         int b=sc.nextInt();
//         System.out.println("You entered"+b);
//         System.out.println("Result: "+(a+b));
//         sc.close();
//     }
// }