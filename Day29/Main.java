
package Day29;

import java.util.Scanner;

// public class Main {
//     static int countNumbersEqualToEight(int[] arr){
//         int count=0;
//         for(int num:arr){
//             if(num==8){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = {8, 5, 8, 10, 3, 8};
//         System.out.println(countNumbersEqualToEight(arr));
//     }
// }
// public class Main {
//     static int countNumbersDivisibleByFour(int[] arr){
//         int count=0;
//         for(int num:arr){
//             if (num%4==0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = {4, 7, 8, 12, 15, 16};
//         System.out.println(countNumbersDivisibleByFour(arr));
//     }
// }
// public class Main {
//     static int sumNumbersGreaterThanTen(int[] arr){
//         int sum=0;
//         for(int num:arr){
//             if(num>10){
//                 sum+=num;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 12, 8, 15, 20};
//         System.out.println(sumNumbersGreaterThanTen(arr));
//     }
// }
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
