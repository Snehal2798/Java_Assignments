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
