package Day3627;

// public class Main {
//     static int findLastEvenLessThanTwenty(int[] arr){
//         int last=-1;
//         for(int num:arr){
//            if(num<20&&num%2==0){
//             last=num;
//            } 
//         }
//         return last;
//     }
//     public static void main(String[] args) {
//         int[] arr = {22, 18, 25, 14, 9, 16, 30};
//         System.out.println(findLastEvenLessThanTwenty(arr));
//     }
// }
/**
 * Main
 */
public class Main {
    static int findFirstPositiveEvenGreaterThanTen(int[] arr){
     
        for(int num:arr){
            if(num>0&&num%2==0&&num>10){
               return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-5, 7, 8, 12, 15, 20};
        System.out.println(findFirstPositiveEvenGreaterThanTen(arr));
    }
}
