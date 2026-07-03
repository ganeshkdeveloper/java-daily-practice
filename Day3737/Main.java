package Day3737;
public class Main {
    static int countPositiveOddNumbersGreaterThanTen(int[] arr){
        int count=0;
        for(int num:arr){
            if(num>0&&num%2!=0&&num>10){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={-5, 11, 8, 13, 20, 15, -9};
        System.out.println(countPositiveOddNumbersGreaterThanTen(arr));
    }
}
