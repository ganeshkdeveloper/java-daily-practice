package Day28;

    // public class Main {
    //     static int countNumbersEqualToFive(int[] arr){
    //         int count=0;
    //         for(int num:arr){
    //             if(num==5){
    //                 count++;
    //             }
    //         }
    //         return count;
    //     }
    //     public static void main(String[] args) {
    //         int[] arr = {5, 2, 5, 8, 10, 5};
    //         System.out.println(countNumbersEqualToFive(arr));
    //     }
    // }

    // public class Main {
    // static int countNumbersEqualToThree(int[] arr){
    //     int count=0;
    //     for(int num:arr){
    //         if(num==3){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    //     public static void main(String[] args) {
    //         int[] arr = {3, 5, 3, 8, 10, 3};
    //         System.out.println(countNumbersEqualToThree(arr));
    //     }
    // }

    // public class Main {
    //     static String reverse(String str){
    //         StringBuilder sb=new StringBuilder(str);
    //         return sb.reverse().toString();
    //     }
    //     public static void main(String[] args) {
    //           System.out.println(reverse("hello"));
    //     }
    // }
    // public class Main {
    
    //     static boolean isPrime(int n){
    //         if(n<=1) return false;
    //         for(int i=2;i*i<=n;i++){
    //             if(n%i==0) return false;
    //         }
    //         return true;
    //     }
    //     public static void main(String[] args) {
    //         System.out.println(isPrime(17));
    //     }
    // }
    public class Main {
    static int findMax(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 7};
        System.out.println(findMax(arr));
        }
    }