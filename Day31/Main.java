package Day31;
public class Main {
    static boolean containsNumber(int[] arr,int target){
        for(int num:arr){
            if(num==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, 9};
        System.out.println(containsNumber(arr,12));
    }
}
