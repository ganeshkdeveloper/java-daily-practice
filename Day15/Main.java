package Day15;

public class Main {
    static int countGreaterThanTen(int[] arr){
        int count=0;
        for(int num:arr){
            if(num>10){
                count++;
            }
        }
        return count;
    }
public static void main(String[] args) {
    int[] arr = {5, 12, 8, 15, 20};
    System.out.println(countGreaterThanTen(arr));
}
    
}