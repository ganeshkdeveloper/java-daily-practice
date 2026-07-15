package Day48157;
// public class Main {
//     static int findIndexOfLastNegativeEvenLessThanMinusTen(int[] arr){
//         int index=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0&&arr[i]<0&&arr[i]<-10){
//                 index=i;
//             }
//         }
//         return index;
//     }
//     public static void main(String[] args) {
//         int[] arr={-8, -12, -15, -18, -5, -20};
//         System.out.println(findIndexOfLastNegativeEvenLessThanMinusTen(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findIndexOfSmallestPositiveEvenGreaterThanTen(int[] arr){
//         int smallest=Integer.MAX_VALUE;
//         int index=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0&&arr[i]%2==0&&arr[i]>10&&arr[i]<smallest){
//                 smallest=arr[i];
//                 index=i;
//             }
//         }
//         return index;
//     }
//     public static void main(String[] args) {
//         int[] arr={8, 18, 14, 22, 12, 5};
//         System.out.println(findIndexOfSmallestPositiveEvenGreaterThanTen(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int countEvenNumbersWhoseIndexIsOdd(int[] arr){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(i%2!=0&&arr[i]%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr={10, 15, 20, 8, 7, 12, 18};
//         System.out.println(countEvenNumbersWhoseIndexIsOdd(arr));
//     }
// }