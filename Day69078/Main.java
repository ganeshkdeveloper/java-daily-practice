package Day69078;

// import java.util.Scanner;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Hai! Enter Your salary wish!: ");
//         int num=sc.nextInt();
//         System.out.println("Oh! your wish is to earn "+num+","+ "congragulations!");
//     }
// }
/**
 * Main
 */
// public class Main {
//     static boolean isArmstrong(int num){
//         int original=num;
//         int count=0;
//         int temp=num;
//         if(temp==0){
//             count=1;
//         }
//         while (temp>0) {
//             count++;
//             temp=temp/10;
//         }
//         int sum=0;
//          temp=num;
//          if(temp==0){
//             sum=0;
//          }
//          while (temp>0) {
//             int digit=temp%10;
//             int power=1;
//             for (int i=1;i<=count;i++){
//                 power=power*digit;
//             }
//             sum=sum+power;
//             temp=temp/10;
//          }
//          return sum==original;

//     } 
//     public static void main(String[] args) {
//        int num1 = 153;
//         int num2 = 370;
//         int num3 = 371;
//         int num4 = 407;
//         int num5 = 123;
//         int num6 = 0;

//         System.out.println(num1 + " -> " + isArmstrong(num1));
//         System.out.println(num2 + " -> " + isArmstrong(num2));
//         System.out.println(num3 + " -> " + isArmstrong(num3));
//         System.out.println(num4 + " -> " + isArmstrong(num4));
//         System.out.println(num5 + " -> " + isArmstrong(num5));
//         System.out.println(num6 + " -> " + isArmstrong(num6));
//     }
// }
// public class Main {

//     static boolean isPrime(int num) {

//         // Handle negative numbers, 0, and 1
//         if (num <= 1) {
//             return false;
//         }

//         // Check for divisors
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }

//         // No divisors found
//         return true;
//     }

//     public static void main(String[] args) {

//         int num1 = 2;
//         int num2 = 3;
//         int num3 = 4;
//         int num4 = 5;
//         int num5 = 17;
//         int num6 = 21;
//         int num7 = 1;
//         int num8 = 0;
//         int num9 = -5;

//         System.out.println(num1 + " -> " + isPrime(num1));
//         System.out.println(num2 + " -> " + isPrime(num2));
//         System.out.println(num3 + " -> " + isPrime(num3));
//         System.out.println(num4 + " -> " + isPrime(num4));
//         System.out.println(num5 + " -> " + isPrime(num5));
//         System.out.println(num6 + " -> " + isPrime(num6));
//         System.out.println(num7 + " -> " + isPrime(num7));
//         System.out.println(num8 + " -> " + isPrime(num8));
//         System.out.println(num9 + " -> " + isPrime(num9));
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         System.out.println("Welcome to the world");
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("What's your name?");
//         String name=sc.nextLine();
//         System.out.println("Your name is "+ name);
//         sc.close();
//     }
// }
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world of java");
    }
}