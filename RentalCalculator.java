/*
-Imagine you're developing a vehicle rental system. The system rents out cars, bikes, and trucks. Each type of vehicle has a method to calculate rental cost, but the calculation is different for each vehicle type.
This is a great real-world example of polymorphism:
You can call the same method calculateRentalCost() on any vehicle,
But it behaves differently depending on whether it's a Car, Bike, or Truck."
 */

package Practice;

import java.util.Scanner;

public class RentalCalculator {

    static int costForBike;
    static double  costForCar;
    static double  costForTruck;


    // Charges for Bike rent
    public void calculateRentalCost(int N_of_h,int Charg, int hel)
    {
        costForBike=N_of_h*Charg+hel;
        System.out.println("*****************RENTAL SYSTEM********************");
        System.out.println("Total Cost for Bike :" +costForBike);

    }

    //Charges for Car Rent
    public void calculateRentalCost(int N_of_d, double charg, int hel )
     {
         costForCar=N_of_d*charg+hel;
         System.out.println("*****************RENTAL SYSTEM********************");
         System.out.println("Total Cost for Car:" +costForCar);
     }

     //Charges for Truck rent
    public void calculateRentalCost(int N_of_d, float charg, float load)
    {
        costForTruck=N_of_d*charg+load;
        System.out.println("*****************RENTAL SYSTEM********************");
        System.out.println("Total Cost for Truck:" +costForTruck);
    }
    public void displaytotalcharges()
    {
        System.out.println("*****************RENTAL SYSTEM********************");
        System.out.println("Total Cost for Bike :" +costForBike);
        System.out.println("Total Cost for Car:" +costForCar);
        System.out.println("Total Cost for Truck:" +costForTruck);
    }
   public  static void main(String args[])
   {
       RentalCalculator r1=new RentalCalculator();
       String vehicle=null;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your choice:");
       vehicle=sc.nextLine();
       if(vehicle.equals("bike"))
       {
           r1.calculateRentalCost(2,500,100);
       } else if (vehicle.equals("car")) {
           r1.calculateRentalCost(1,300.0,500);

       }
       else if (vehicle.equals("truck"))
       {
           r1.calculateRentalCost(3,5000.50f,200f);
       }
       else
       {
           r1.calculateRentalCost(2,500,100);
           r1.calculateRentalCost(1,300.0,500);
           r1.calculateRentalCost(3,5000.50f,200f);
       }
   }

  }
