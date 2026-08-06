package Day68068;

public class Main {
    static int reverseNumber(int num){
        int reversed=0;
        if(num==0){
            return -1;
        }
        while (num>0) {
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int num1=12345;
        int num2=1002;
        int num3=7;
        System.out.println(reverseNumber(num1));
        System.out.println(reverseNumber(num2));
        System.out.println(reverseNumber(num3));
    }
}
