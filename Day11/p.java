package Day11;

public class p {
    static int countNegativeNumbers(int[] arr){
       int count=0;
        for(int num:arr){
            if(num<0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {-5, 3, 0, 8, -2, 10};
        System.out.println(countNegativeNumbers(arr));
    }
    
}