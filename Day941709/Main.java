package Day941709;

// public class Main {
//     static int add(int a, int b){
//         return a+b;
//     }
//     static int add(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args){
//         System.out.println(add(10,20));
//         System.out.println(add(10,20,30));
//     }
// }

public class Main{
    static int multiply(int a, int b){
        return a*b;
    }
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args){
        System.out.println(multiply(2, 3));
          System.out.println(multiply(2, 3,4));
    }
}