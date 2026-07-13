package Day46137;
// public class Main {
//     static int findLargestPositiveOddLessThanHundred(int[] arr){
//         int largest=-1;
//         for(int num:arr){
//             if(num>0&&num%2!=0&&num<100&&num>largest){
//                 largest=num;
//             }
//         }
    
//         return largest;
//     }
//     public static void main(String[] args) {
//         int[] arr={101, 75, 48, 99, 35, 84};
//         System.out.println(findLargestPositiveOddLessThanHundred(arr));
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Solvec");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Hello World to real Applications");
//     }
// }
/**
 * Main
 */
public class Main {
    static int findFirstNegativeOddGreaterThanMinusTwenty(int[] arr){
        for(int num:arr){
            if(num<0&&num%2!=0&&num>-20){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-25, -18, -19, -7, 10, -3};
        System.out.println(findFirstNegativeOddGreaterThanMinusTwenty(arr));
    }
}