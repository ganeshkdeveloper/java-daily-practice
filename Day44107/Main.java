package Day44107;
// public class Main {
//     static int findSmallestPositiveOddGreaterThanTen(int[] arr){
//         for(int num:arr){
//             if(num>0&&num%2!=0&&num>10){
//                 return num;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 13, 21, 9, 17, 8};
//         System.out.println(findSmallestPositiveOddGreaterThanTen(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findSmallestPositiveOddGreaterThanTen(int[] arr){
//         int samllest=Integer.MAX_VALUE;
//         for(int num:arr){
//             if(num>0&&num>10&&num%2!=0&&num<samllest){
//                 samllest=num;
//             }
//         }
//         return(samllest==Integer.MAX_VALUE?-1:samllest);
//     }
//     public static void main(String[] args) {
//          int[] arr = {5, 13, 21, 9, 17, 8};
//         System.out.println(findSmallestPositiveOddGreaterThanTen(arr));
//     }
// }