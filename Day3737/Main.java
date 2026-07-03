package Day3737;
// public class Main {
//     static int countPositiveOddNumbersGreaterThanTen(int[] arr){
//         int count=0;
//         for(int num:arr){
//             if(num>0&&num%2!=0&&num>10){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr={-5, 11, 8, 13, 20, 15, -9};
//         System.out.println(countPositiveOddNumbersGreaterThanTen(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findSmallestPositiveEvenNumber(int[] arr){
//         int smallest=Integer.MAX_VALUE;
//         for(int num:arr){
//             if(num>0&&num%2==0&&num<smallest){
//                 smallest=num;
//             }
//         }
//         if(smallest==Integer.MAX_VALUE){
//             return -1;
//         }
//         return smallest;
//     }

//     public static void main(String[] args) {
//         int[] arr = {-4, 18, 7, 12, 3, 20, 6};
//         System.out.println(findSmallestPositiveEvenNumber(arr));
//     }
// }
/**
 * Main
 */
public class Main {
        static int sumPositiveEvenNumbersLessThanThirty(int[] arr){
            int sum=0;
            for(int num:arr){
                if(num>0&&num%2==0&&num<30){
                    sum+=num;
                }
            }
            return sum;
        }
    public static void main(String[] args) {
        int[] arr = {-4, 18, 7, 12, 35, 20, 6};
        System.out.println(sumPositiveEvenNumbersLessThanThirty(arr));
    }
}