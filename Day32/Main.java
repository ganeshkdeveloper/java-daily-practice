package Day32;

// public class Main {
//     public static void main(String[] args) {
//         int number=10;
//         System.out.println(number);
//     }
// }

/**
 * Main
 */
// public class Main {
//     static int findFirstPositive(int[] arr){
//         for(int num:arr){
//             if(num>0){
//                 return num;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//          int[] arr = {-5, -2, 0, 7, 10};
//             System.out.println(findFirstPositive(arr));
//     }
// }
/**
 * Main
 */
public class Main {
    static int findLastPositive(int[] arr){
        int lastPositive=-1;
        for(int num:arr){
            if(num>0){
                lastPositive=num;
            }
        }
        return lastPositive;
    }
    public static void main(String[] args) {
        int[] arr = {-5, -2, 0, 7, 10, -3};
        System.out.println(findLastPositive(arr));
    }
}