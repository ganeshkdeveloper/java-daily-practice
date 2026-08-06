package Day68068;

// public class Main {
//     static int reverseNumber(int num){
//         int reversed=0;
//         if(num==0){
//             return -1;
//         }
//         while (num>0) {
//             int digit=num%10;
//             reversed=reversed*10+digit;
//             num=num/10;
//         }
//         return reversed;
//     }
//     public static void main(String[] args) {
//         int num1=12345;
//         int num2=1002;
//         int num3=7;
//         System.out.println(reverseNumber(num1));
//         System.out.println(reverseNumber(num2));
//         System.out.println(reverseNumber(num3));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static boolean isPalindrome(int num){
//         int original=num;
//         int reversed=0;
//         while (num>0) {

//             int digit=num%10;
//             reversed=reversed*10+digit;
//             num=num/10;
//         }
//         return reversed==original;
//     }
//     public static void main(String[] args) {
//         int num1=121;
//         int num2=123;
//         int num3=1221;
//         int num4=7;
//         System.out.println(isPalindrome(num1));
//         System.out.println(isPalindrome(num2));
//         System.out.println(isPalindrome(num3));
//         System.out.println(isPalindrome(num4));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int countDigits(int num){
//         if(num==0){
//             return 1;
//         }
//         int count=0;
//         while (num>0) {
//             count++;
//             num=num/10;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int num1=12345;
//         int num2=7;
//         int num3=1000;
//         int num4=987654321;
//         int num5=0;
//         System.out.println(countDigits(num1));
//         System.out.println(countDigits(num2));
//         System.out.println(countDigits(num3));
//         System.out.println(countDigits(num4));
//         System.out.println(countDigits(num5));

//     }
// }
/**
 * Main
 */
// public class Main {
//     static int sumOfDigits(int num){
//         int sum=0;
//         while (num>0) {
//             int digit=num%10;
//             sum=sum+digit;
//             num=num/10;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int num1=12345;
//         int num2=7;
//         int num3=1000;
//         int num4=987;
//         int num5=0;
//         System.out.println(sumOfDigits(num1));
//         System.out.println(sumOfDigits(num2));
//         System.out.println(sumOfDigits(num3));
//         System.out.println(sumOfDigits(num4));
//         System.out.println(sumOfDigits(num5));
//     }
// }
/**
 * Main
 */
// public class Main {
//     static int productOfDigits(int num){
//         int product=1;
//         while (num>0) {
//             int digit=num%10;
//             product=product*digit;
//             num=num/10;
//         }
//         return product;
//     }
//     public static void main(String[] args) {
//         int num1=1234;
//         int num2=7;
//         int num3=1002;
//         int num4=345;
//         int num5=0;
//         System.out.println(productOfDigits(num1));
//         System.out.println(productOfDigits(num2));
//         System.out.println(productOfDigits(num3));
//         System.out.println(productOfDigits(num4));
//         System.out.println(productOfDigits(num5));
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
//         temp=num;
//         while (temp>0) {
//             int digit=temp%10;
//             int power=1;
//             for (int i=1;i<=count;i++){
//                 power=power*digit;
//             }
//             sum=sum+power;
//             temp=temp/10;
//         }
//         return sum==original;

//     }
//     public static void main(String[] args) {
//         int num1 = 153;
//         int num2 = 370;
//         int num3 = 371;
//         int num4 = 407;
//         int num5 = 123;

//         System.out.println(isArmstrong(num1));
//         System.out.println(isArmstrong(num2));
//         System.out.println(isArmstrong(num3));
//         System.out.println(isArmstrong(num4));
//         System.out.println(isArmstrong(num5));

//     }
// }