// public class today {
//     public static void main(String[] args) {
//         System.out.println("hello world");
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         System.out.println("Sum = "+(a+b));
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int n=7;
//         if(n%2==0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int a=15;
//         int b=25;
//         if(a>b){
//             System.out.println(a+" is largest");
//         }else if(b>a){
//             System.out.println(b+" is largest");
//         }else{
//             System.out.println("Both are equal");
//         }
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int a=5;
//         int b=10;
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int n=5;
//         long fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println("Factorial = " + fact);
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=10;i++){
//             System.out.println(n + " X " + i + " = " + (n*i));
//         }
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int n=1234;
//         int rev=0;
//         while (n!=0) {
//             int digit=n%10;
//             rev=rev*10+digit;
//             n=n/10;
//         }
//         System.out.println("Reverse = "+rev);
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int n=121;
//         int original=n;
//         int rev=0;
//         while (n>0) {
//             rev=rev*10+n%10;
//             n=n/10;
//         }
//         if(original==rev){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int n=7;
//         boolean prime=n>=2;
//         for(int i=2;i<=n/i;i++){
//             if(n%i==0){
//                 prime=false;
//                 break;
//             }
//         }
//         if(prime){
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not Prime");
//         }
//     }
// }
/**
 * today
 */
// public class today {

//     public static void main(String[] args) {
//         int a=0,b=1;
//         for(int i=1;i<=10;i++){
//             System.out.print(a+" ");
//             int next=a+b;
//             a=b;
//             b=next;
//         }
//     }
// }
/**
 * today
 */
public class today {

    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while (n>0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println("sum = "+sum);
    }
}