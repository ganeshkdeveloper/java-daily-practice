package Day4397;
// public class Main {
//     static int findSecondLargestNegativeEvenNumber(int[] arr){
//         int firstLargest=Integer.MIN_VALUE;
//         int secondLargest=Integer.MIN_VALUE;
//         for(int num:arr){
//             if(num%2==0&&num<0){
//                 if(num>firstLargest){
//                     secondLargest=firstLargest;
//                     firstLargest=num;
//                 }else if(num>secondLargest&&num!=firstLargest){
//                     secondLargest=num;
//                 }
//             }
           
//             }
//              if(secondLargest==Integer.MIN_VALUE){
//                 return -1;
//         }
//         return secondLargest;
//     }
//     public static void main(String[] args) {
//         int[] arr = {-12, -8, -20, -2, 5, 10};
//         System.out.println(findSecondLargestNegativeEvenNumber(arr));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int findSecondSmallestNegativeOddNumber(int[] arr){
//         int firstSmallest=Integer.MAX_VALUE;
//         int secondSmallest=Integer.MAX_VALUE;
//         for(int num:arr){
//             if(num%2!=0&&num<0){
//                 if(num<firstSmallest){
//                     secondSmallest=firstSmallest;
//                     firstSmallest=num;
//             }else if(num<secondSmallest&&num!=firstSmallest){
//                 secondSmallest=num;
//             }
            
//             }
            
//         }
//         if(secondSmallest==Integer.MAX_VALUE){
//                 return -1;
//             }
//         return secondSmallest;
//     }
//     public static void main(String[] args) {
//         int[] arr={-11, -5, -17, -9, 8, -3};
//         System.out.println(findSecondSmallestNegativeOddNumber(arr));
//     }
// }
/**
 * Main
 */
public class Main {
    static int findSecondLargestPositiveOddNumber(int[] arr){
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>0&&num%2!=0){
                if(num>firstLargest){
                    secondLargest=firstLargest;
                    firstLargest=num;
                }else if(num>secondLargest&&num!=firstLargest){
                    secondLargest=num;
                }
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr={21, 9, 35, 17, 42, 29};
        System.out.println(findSecondLargestPositiveOddNumber(arr));
    }
}