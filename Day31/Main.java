package Day31;
// public class Main {
//     static boolean containsNumber(int[] arr,int target){
//         for(int num:arr){
//             if(num==target){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 8, 12, 3, 9};
//         System.out.println(containsNumber(arr,12));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findIndex(int[] arr, int target){
//         for(int i = 0; i < arr.length; i++){
//             if (arr[i]==target){
//                 return i;
//             }
//         }
//         return-1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 8, 12, 3, 9};
//         System.out.println(findIndex(arr, 12));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findSecondLargest(int[] arr){
//         int largest=arr[0];
//         int SecondLargest=arr[0];
//         for(int num:arr){
//             if(num>largest){
//                 SecondLargest=largest;
//                 largest=num;
//             }else if(num>SecondLargest&&num!=largest){
//                 SecondLargest=num;
//             }
//         }
//         return SecondLargest;
//     }
//     public static void main(String[] args) {
//         int[] arr = {8, 3, 12, 1, 6, 10};
//         System.out.println(findSecondLargest(arr));
//     }
// }