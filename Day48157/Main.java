package Day48157;
public class Main {
    static int findIndexOfLastNegativeEvenLessThanMinusTen(int[] arr){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i]<0&&arr[i]<-10){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={-8, -12, -15, -18, -5, -20};
        System.out.println(findIndexOfLastNegativeEvenLessThanMinusTen(arr));
    }
}
