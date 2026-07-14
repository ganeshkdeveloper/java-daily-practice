package Day47147;
public class Main {
    static int countPositiveEvenNumbersGreaterThanTwenty(int[] arr){
        int count=0;
        for(int num:arr){
            if(num%2==0&&num>0&&num>20){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={18, 22, 35, 40, 21, 26};
        System.out.println(countPositiveEvenNumbersGreaterThanTwenty(arr));
    }
}
