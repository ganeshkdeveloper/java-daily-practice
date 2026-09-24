// public class Main {
//     public static void main(String[] args) {
//         //if-else condition
//         int marks = 35;
//         if(marks>=40){
//             System.out.println("Pass");
//         }else{
//             System.out.println("Fail");
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         //else-if condition practice
//         int marks = 68;
//         if(marks>=90){
//             System.out.println("Excellent");
//         }else if(marks>=75){
//             System.out.println("Very Good");
//         }else if(marks>=50){
//             System.out.println("Good");
//         }else if(marks>=40){
//             System.out.println("Pass");
//         }else{
//             System.out.println("Fail");
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int age = 20;
//         boolean hasId = true;
//         if(age>=18 && hasId){
//             System.out.println("Allowed");
//         }else{
//             System.out.println("Entry denied");
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int age = 20;
//         boolean hasLicense = true;
//         if(age>=18){
//             if(hasLicense){
//                 System.out.println("You can drive");
//             }
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int age = 65;
//         if(age>=60){
//             System.out.println("Senoir Citizen");
//         }else if(age>=30){
//             System.out.println("Adult");
//         }else if(age>=18){
//             System.out.println("Young Adult");
//         }else{
//             System.out.println("Minor");
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         //Ternary operator practice
//         int age = 17;
//         String status = age>=18? "Adult":"Minor";
//         System.out.println(status);
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int age = 16;
//         boolean hasParent = true;
//         boolean hasLicense = false;
//         if(age>=18){
//             if(hasLicense){
//                 System.out.println("Can drive");
//             }else{
//                 System.out.println("Need a license");
//             }
//         }else{
//             if(hasParent){
//                 System.out.println("Need parent SuperVision");
//             }else{
//                 System.out.println("Cannot drive");
//             }
//         }
//     }
// }
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         //Switch case
//         int day = 5;
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5: 
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//                 break;
//         }
//     }
// }
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
            }
    }
}