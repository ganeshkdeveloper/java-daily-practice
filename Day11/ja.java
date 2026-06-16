package Day11;

public class ja {
    static int findFirstNegative(int[] arr){
    
        for(int num:arr){
            if(num<0){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={5, 8, -3, 10, -7};
        System.out.println(findFirstNegative(arr));
    }
}
