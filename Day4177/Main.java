package Day4177;
/**
 * Main
 */
/**
 * Main
 */
// public class Main {
//     static int findLargestEvenNumberLessThanFifty(int[] arr){
//         int largest=-1;
//         for(int num:arr){
//             if(num%2==0&&num<50&&num>largest){
//                 largest=num;
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int[] arr = {52, 18, 44, 49, 36, 60};
//         System.out.println(findLargestEvenNumberLessThanFifty(arr));
//     }
// }
/**
 * Main
 */
public class Main {
    static int findSmallestNegativeOddGreaterThanMinusTwenty(int[] arr){
        int smallest=-1;
        for(int num:arr){
            if(num%2!=0&&num<0&&num>-20){
                if(smallest==-1||num<smallest){
                    smallest=num;
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr={-25, -19, -7, -15, 8, -3};
        System.out.println(findSmallestNegativeOddGreaterThanMinusTwenty(arr));
    }
}