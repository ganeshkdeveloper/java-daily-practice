package Day54217;

// public class Main {
//     static String reverseString(String str){
//         String reversed="";
//         for(int i=str.length()-1;i>=0;i--){
//             reversed+=str.charAt(i);
//         }
//         return reversed;
//     }
//     public static void main(String[] args) {
//         String input="Ganesh";
//         System.out.println(reverseString(input));
//     }
// }

/**
 * Main
 */
// public class Main {
//     static boolean isPalindrome(String str){
//         int left=0;
//         int right=str.length()-1;
//         while (left<right) {
//             if(str.charAt(left)!=str.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     } 
//     public static void main(String[] args) {
//         System.out.println(isPalindrome("madam"));
//         System.out.println(isPalindrome("hello")); 
//         System.out.println(isPalindrome("level")); 
//     }
// }
// import java.util.Scanner;

// public class Main {

//     static boolean isPalindrome(String str) {
//         String reversed = "";

//         // Reverse the string
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }

//         // Compare original and reversed strings
//         return str.equals(reversed);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         System.out.println(isPalindrome(str));

//         sc.close();
//     }
// }
/**
 * Main
 */
public class Main {
     static int countCharacter(String str, char target){
        int count=0;
        target=Character.toLowerCase(target);
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch==target){
                count++;
            }
        }
        return count;
     }
     public static void main(String[] args) {
        System.out.println(countCharacter("Ganesh", 'a'));
        System.out.println(countCharacter("Mississippi", 's'));   
        System.out.println(countCharacter("Developer", 'e'));     
        System.out.println(countCharacter("GanEsh", 'e'));    
     }
}