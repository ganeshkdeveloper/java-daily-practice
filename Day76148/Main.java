package Day76148;
/**
 * Main
 */
public class Main {
    static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(10));  
        System.out.println(isEven(7));   
        System.out.println(isEven(24));  
        System.out.println(isEven(15));  
        System.out.println(isEven(0)); 
    }
}