package Day23;

public class Main {
    static int countMultiplesOfTwo(int[] arr){
        int count=0;
        for(int num:arr){
            if(num%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};
        System.out.println(countMultiplesOfTwo(arr));
    }
}
