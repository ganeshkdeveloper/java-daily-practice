package Day3517;
public class Main {
    static int findLargestOddLessThanTwenty(int[] arr){
        int largest=-1;
        for(int num:arr){
            if(num<20&&num%2!=0&&num>largest){
                largest=num;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {25, 19, 17, 22, 15, 30};

        System.out.println(findLargestOddLessThanTwenty(arr));
    }
}
