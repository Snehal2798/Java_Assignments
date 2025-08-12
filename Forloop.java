/*
- You're programming a laundry machine timer. The machine runs for a certain number of minutes (let's say 5). For each minute, the machine displays:"Washing... Minute: X"

Once it finishes, it shows "Washing complete!"

This for loop runs 5 times, representing each minute of the wash cycle.

 */

package Practice;

public class Forloop {
    public static void main (String args[])
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Machine time :" +i );
        }
        System.out.println("Washing completed");
    }
}
