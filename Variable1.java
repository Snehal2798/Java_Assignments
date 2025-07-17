package Practice;

public class Variable1
{
    static int a=10;
    int b=20;
    public void getDetails()
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        int c=30;
        System.out.println(c);
        Variable1 s1= new Variable1();
        System.out.println(s1.b);
        System.out.println(a);
        s1.getDetails();
        }
}

