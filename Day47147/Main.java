package Day47147;
// import java.util.*;
// public class Main {
//     static int countPositiveEvenNumbersGreaterThanTwenty(int[] arr){
//         int count=0;
//         for(int num:arr){
//             if(num%2==0&&num>0&&num>20){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr={18, 22, 35, 40, 21, 26};
//         System.out.println(countPositiveEvenNumbersGreaterThanTwenty(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findIndexOfSmallestNegativeOddNumber(int[] arr){
//         int smallest=Integer.MAX_VALUE;
//         int index=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2!=0&&arr[i]<smallest&&arr[i]<0){
//                 smallest=arr[i];
//                 index=i;
//             }
//         }
//         return index;
//     }
//     public static void main(String[] args) {
//         int[] arr={-7, -15, -3, -21, 10, -5};
//         System.out.println(findIndexOfSmallestNegativeOddNumber(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findIndexOfFirstPositiveOddGreaterThanThirty(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2!=0&&arr[i]>0&&arr[i]>30){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr={18, 24, 35, 41, 28, 45};
//         System.out.println( findIndexOfFirstPositiveOddGreaterThanThirty(arr));
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Your Mail:");
//         String a=sc.nextLine();
//         System.out.println("Your Mail id is: "+a);
//         System.out.println("Are u Ready to Solve problem? (Yes/No)");
//         String b=sc.nextLine();
//         if ("yes".equalsIgnoreCase(b)){
//             System.out.println("2+2=?");
//             System.out.println("Type Your Answer:");
//             int c=sc.nextInt();

//             if(c==4){
//                 System.out.println("Correct Answer");
//             }else{
//                 System.out.println("Wrong Answer");
//             }
//         }else{
//             System.out.println("Thank You! Bye!");
//         }
          
        
//         sc.close();
//     }
// }