package Day50177;

// public class Main {
//     static int findCheapestProduct(int[] prices){
//          int cheapest = Integer.MAX_VALUE;
//         for(int price:prices){
//             if(price>100&&price<cheapest){
//                 cheapest=price;
//             }
//         }
//           return (cheapest == Integer.MAX_VALUE) ? -1 : cheapest;
//     }
//     public static void main(String[] args) {
//         int[] prices = {80, 150, 120, 95, 200, 110};
//         System.out.println(findCheapestProduct(prices));
//     }
// }
/**
 * Main
 */
public class Main {
    static int findPatientIndex(int[] ages){
        int youngest=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<ages.length;i++){
            if(ages[i]>60&&ages[i]<youngest){
                youngest=ages[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] ages = {45, 62, 75, 61, 59, 68};
        System.out.println(findPatientIndex(ages));
    }
}