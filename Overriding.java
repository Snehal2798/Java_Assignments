/*
- You are developing a ride fare calculator for a transportation app. The company offers different types of rides
Basic Ride
Premium Ride
Each ride has a method calculateFare() that calculates the total fare based on the distance traveled.
But the fare calculation differs for each ride type:
Basic Ride: ₹10 per km
Premium Ride: ₹20 per km + ₹50 fixed luxury charge
This is a perfect use case for method overriding, where the subclass provides its own version of a method defined in the parent class.
 */
package Practice;
import java.awt.*;

 class Basic
    {
        double CalculateFare(double distance)
        {
            double Basicfare=10.00*distance;
            return Basicfare;
        }
    }
    class Premium extends Basic
    {
        double CalculateFare(double distance)
        {
            double Premiumfare=(20*distance)+50;
            return Premiumfare;
        }
    }
    public class Overriding{
    public static void main(String[] args) {
        Basic basicRide = new Basic();
        Premium premiumRide = new Premium();
        System.out.println("**********************TRANSPORTATION APP*******************");
        System.out.println("Basic Ride cost is:" +basicRide.CalculateFare(80.00));
        System.out.println("Premium Ride cost is: " +premiumRide.CalculateFare(12.00));

    }
}
