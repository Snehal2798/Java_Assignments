/*
- You are building a basic game system where a player completes levels from 1 to 10.

The player gets eliminated at level 6 (we'll use break here to stop the game).

If the player skips level 3 for some reason (maybe it's locked or under maintenance), the program will skip that level using continue.

*/
package Practice;

public class JumpingStatment {
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            if(i==3)
            {
                System.out.println("This is Level 3 hence skipping this level");
                continue;
            }
            if (i==6)
            {
                System.out.println("Level 6 : Game is stopped");
                break;
            }
            System.out.println("Player is on level:" +i);
        }
    }
}
