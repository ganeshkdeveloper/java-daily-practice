package Day02;
enum Status{
    PENDING,
    APPROVED,
    REJECTED
}
public class Main1{
    public static void main(String[] args){
        Status s=Status.APPROVED;
        System.out.println(s);
    }
}