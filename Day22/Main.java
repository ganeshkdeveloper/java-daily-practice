package Day22;

public class Main {
    static int countMultiplesOfThree(int[] arr){
        int count=0;
        for(int num:arr){
            if(num%3==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={3, 5, 9, 10, 12};
        System.out.println(countMultiplesOfThree(arr));
    }
}
