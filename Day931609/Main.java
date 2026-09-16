package Day931609;
public class Main {
    public static void main(String[] args) {
        int[] numbers={5, 15, 25, 35, 45};
        int search=25;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==search){
                 System.out.println("Found");
            }
        }
    }
}
