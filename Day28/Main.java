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

    public class Main {
    static int countNumbersEqualToThree(int[] arr){
        int count=0;
        for(int num:arr){
            if(num==3){
                count++;
            }
        }
        return count;
    }
        public static void main(String[] args) {
            int[] arr = {3, 5, 3, 8, 10, 3};
            System.out.println(countNumbersEqualToThree(arr));
        }
    }