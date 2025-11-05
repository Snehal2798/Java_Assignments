/*

- You’re building a system for an online movie ticket booking app. Every time a user books a ticket, the system should store information like:

Movie name
Show time
Seat number
User name
Whenever a ticket is created, these details should be initialized automatically using a constructor.
Your job is to create a class called Ticket, and use a constructor (__init__ method in Python) to initialize ticket details when a new object is created.
Objective
Create a class with a constructor.
Use the constructor to initialize object attributes.
Create multiple ticket objects and display their details.
 */

package Practice;

import java.util.Arrays;

public class Ticket
{
    String usname;
    String mvname;
    String time;
    int[] seat_no;

    public Ticket(String us,String mv,String t, int s[] )
    {
        usname=us;
        mvname=mv;
        time=t;
        seat_no=s;
    }
    void displayticket()
    {
        System.out.println("Username is :" +usname);
        System.out.println("Movie name is:" +mvname);
        System.out.println("Show time is:" +time);
        System.out.println("Seat numbers are:" + Arrays.toString(seat_no) +"\n");
    }
    public static void main(String args[])
    {
      Ticket t1=new Ticket("Snehal", "Saiyara", "12pm",new int[]{15,16,17});
      t1.displayticket();
      Ticket t2=new Ticket("Snehit","Kantara", "1pm",new int[]{11,12,13,14});
      t2.displayticket();
      Ticket t3=new Ticket("Swati","Stree","3pm",new int[]{20,21,22,23} );
      t3.displayticket();

    }
}

