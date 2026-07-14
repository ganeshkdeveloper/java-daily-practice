package Day47147;
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
public class Main {
    static int findIndexOfFirstPositiveOddGreaterThanThirty(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0&&arr[i]>0&&arr[i]>30){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={18, 24, 35, 41, 28, 45};
        System.out.println( findIndexOfFirstPositiveOddGreaterThanThirty(arr));
    }
}
