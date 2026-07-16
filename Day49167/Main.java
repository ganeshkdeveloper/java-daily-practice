package Day49167;

// public class Main {
//     static int sumPositiveOddNumbersWhoseIndexIsEven(int[] arr){
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             if(i%2==0&&arr[i]%2!=0){
//                 sum+=arr[i];
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int[] arr={11, 8, 15, 20, 21, 6, 9};
//         System.out.println(sumPositiveOddNumbersWhoseIndexIsEven(arr));
//     }
// }
/**
 * Main
 */
public class Main {
    static int findFirstStudentAboveEighty(int[] arr){
   
        for(int num:arr){
            if(num>80){
             return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={65, 72, 81, 90, 78, 95};
        System.out.println(findFirstStudentAboveEighty(arr));
    }
}