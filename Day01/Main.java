package Day01;
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello Ganesh!");
//     }
// }

//interface
interface Vehicle{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
}
public class Main{
    public static void main(String[] args){
        Car c1=new Car();
        c1.start();
    }
}