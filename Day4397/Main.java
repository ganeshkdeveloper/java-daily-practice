package Day4397;
public class Main {
    static int findSecondLargestNegativeEvenNumber(int[] arr){
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num%2==0&&num<0){
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
        int[] arr = {-12, -8, -20, -2, 5, 10};
        System.out.println(findSecondLargestNegativeEvenNumber(arr));
    }
}
