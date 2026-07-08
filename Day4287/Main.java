package Day4287;

// public class Main {
//     static int findLargestNegativeEvenNumber(int[] arr){
//         int largest=Integer.MIN_VALUE;
//         for(int num:arr){
//             if(num<0&&num%2==0&&num>largest){
//                 largest=num;
//             }
//         }
//         if (largest == Integer.MIN_VALUE) {
//     return -1;
// }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int[] arr = {-12, -8, -20, -5, 4, -2};
//         System.out.println(findLargestNegativeEvenNumber(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findFirstPositiveOddLessThanTwenty(int[] arr){
//         for(int num:arr){
//             if(num>0&&num%2!=0&&num<20){
//                 return num;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr={-5, 22, 21, 17, 8, 19};
//         System.out.println(findFirstPositiveOddLessThanTwenty(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findLastPositiveEvenLessThanThirty(int[] arr){
//         int last=-1;
//         for(int num:arr){
//             if(num>0&&num%2==0&&num<30){
//                 last=num;
//             }
//         }
//         return last;
//     }
//     public static void main(String[] args) {
//         int[] arr={32, 18, 25, 28, 15, 12, 40};
//         System.out.println(findLastPositiveEvenLessThanThirty(arr));
//     }
// }