package Day21;

public class Main {
    static int countMultiplesOfFive(int[] arr){
        int count=0;
        for(int num:arr){
            if(num%5==0){
                count++;
            }
        }
        return count;
    }
public static void main(String[] args) {
    int[] arr = {5, 12, 10, 15, 22};
    System.out.println(countMultiplesOfFive(arr));
}
}
