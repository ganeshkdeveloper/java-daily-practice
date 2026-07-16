package Day49167;

public class Main {
    static int sumPositiveOddNumbersWhoseIndexIsEven(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0&&arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={11, 8, 15, 20, 21, 6, 9};
        System.out.println(sumPositiveOddNumbersWhoseIndexIsEven(arr));
    }
}
