package Day44107;
public class Main {
    static int findSmallestPositiveOddGreaterThanTen(int[] arr){
        for(int num:arr){
            if(num>0&&num%2!=0&&num>10){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 13, 21, 9, 17, 8};
        System.out.println(findSmallestPositiveOddGreaterThanTen(arr));
    }
}
