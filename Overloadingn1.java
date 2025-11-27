/*
-You are developing a parcel delivery system for a courier company. Customers can send parcels based on:
Weight only (standard delivery)
Weight and distance (for out-of-town delivery)
Weight, distance, and speed option (express delivery)
To handle different types of cost calculations using the same method name but different parameters, you use method overloading.
 */

package Practice;
public class Overloadingn1 {
    static double weight;
    static int distance;
    static int speed;
    static double rateperkg=1000;
    static double ratePerKm=3000;
    public static double calculateCost(double w)
    {
        weight=w;
        double standardprice=rateperkg*weight;
        return standardprice;
    }
    public static double calculateCost(double w, int d)
    {
        weight=w;
        distance=d;
        double outoftownprice=(weight * rateperkg) + (distance* ratePerKm);
        return outoftownprice;

    }
    public static double calculateCost(double w, int d, int s)
    {
        weight=w;
        distance=d;
        speed=s;
        double expressprice=(weight * rateperkg) + (distance* ratePerKm)+speed;
        return expressprice;


    }
    public void displaydata(){
        System.out.println("****************DELIVERY PARCLE SYSTEM*******************");
        System.out.println("Standard delivery charges :" +calculateCost(12.9));
        System.out.println("Out of town delivery charges:" +calculateCost(123.90, 300));
        System.out.println("Express delivery charges :" +calculateCost(34.90,12,100));
    }
    public static void main(String args[])
    {
        Overloadingn1 obj=new Overloadingn1();
        obj.displaydata();
    }
}
