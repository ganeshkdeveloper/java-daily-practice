package Day26;
// public class Main {
//     static int countNumbersLessThanZero(int[] arr){
//         int count=0;
//         for(int num:arr){
//             if(num<0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, -2, 8, -7, 10, -1};
//         System.out.println(countNumbersLessThanZero(arr));
//     }
// }

// public class Main {
// static int countNumbersEqualToTen(int[] arr){
//     int count=0;
//     for(int num:arr){
//         if(num==10){
//             count++;
//         }
//     }
//     return count;
// }
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 10, 8, 10, 3};
//         System.out.println(countNumbersEqualToTen(arr));
//     }
// }
// class Student{
//     private int id;
//     private String name;
//     public void setId(int id){
//         this.id=id;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
// }}
// public class Main {

//     public static void main(String[] args) {
//         Student s=new Student();
//         s.setId(101);
//         s.setName("Ganesh");
//         System.out.println(s.getId());
//         System.out.println(s.getName());
//     }
// }
class Animal{
    void sound(){
         System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class Main {

    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}