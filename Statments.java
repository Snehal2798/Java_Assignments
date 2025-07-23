/*

- You are developing a program for a sports day event where two athletes participated in a race. The school wants to know who completed the race in less time so they can declare the winner.

Your task is to write a program that:
Takes the race completion time (in seconds) for both athletes as input

Compares the times using an if-else statement

Displays who completed the race faster or if it’s a tie
 */

package Practice;

public class Statments {
    public static void main(String args[])
    {
        double Player1_time=10.2;
        double Player2_time=10.2;
        if (Player1_time<Player2_time)
        {
            System.out.println("Player no 1 is the winner");
        }
        else if (Player2_time<Player1_time)
        {
            System.out.println("Player no 2 is the winner");
        }
        else
        {
            System.out.println("It's a tie");
        }
    }
}
