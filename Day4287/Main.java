package Day4287;

public class Main {
    static int findLargestNegativeEvenNumber(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num<0&&num%2==0&&num>largest){
                largest=num;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {-12, -8, -20, -5, 4, -2};
        System.out.println(findLargestNegativeEvenNumber(arr));
    }
}
