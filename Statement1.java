//You are developing a program for a sports day event where two athletes participated in a race. The school wants to know who completed the race in less time so they can declare the winner.
//Your task is to write a program that:Takes the race completion time (in seconds) for both athletes as input Compares the times using an if-else statement Displays who completed the race faster or if it’s a tie

package Practice;

public class Statement1 {

    public static void main(String[] args) {
        float A1=20.5F;
        float B2=21.6F;
        if (A1>B2)
        {
            System.out.println("B has won the race");
        }
        else if (B2>A1)
        {
            System.out.println("A has won the race");
        }
        else
        {
            System.out.println("Its a tie");
        }

    }

}
