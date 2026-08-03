package Day65038;
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Enter the number");
//         System.out.println(2+3);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println(2+5);
//         System.out.println(2-5);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Dont Give Up");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Stand alone");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Do work it all day one day result come dont go back");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("All is Well");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Work Hard Like Hell");
//     }
// }

/**
 * Main
 */
public class Main {
    static int findSecondLargest(int[] arr){
        if(arr==null||arr.length<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest&&num!=largest){
                secondLargest=num;
            }
        }
        return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {5, 5, 5};
        int[] arr3 = {8, 15, 15, 10};
        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
        System.out.println(findSecondLargest(arr3));
    }
}