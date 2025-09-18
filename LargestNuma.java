/*

You are building a Sales Tracking System for a store. The store records the sales of each day in a week (7 days), and the manager wants to find out which day had the highest sales.
write program with using array
 */

package Practice;

public class LargestNuma
{
    public static void main(String args[])
    {
        double sales[]={1200.90,5000.12,3900,2000.19,6900.12,951.10,4912};
        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        double larg=sales[0];
        int index=0;
        for(int i=0;i<sales.length;i++)
        {
            if(sales[i]>larg)
            {
                larg = sales[i];
                index=i;

            }
        }
        System.out.println("The largest number in array is " +larg);
        System.out.println("The day with highest sales is: " +index);

        switch (index)
        {
            case 0:
                System.out.println("Sunday has maximum sale");
            break;
            case 1:
                System.out.println("Monday has maximum sales");
            break;
            case 2:
                System.out.println("Tuesday has maximum sales");
            break;
            case 3:
                System.out.println("Wednesday has maximum sales");
            break;
            case 4:
                System.out.println("Thursday has maximum sales");
            break;
            case 5:
                System.out.println("Friday has maximum sales");
            break;
            case 6:
                System.out.println("Saturday has maximum sales");
            break;
            default:
                System.out.println("None of the day has highest sales");
        }

    }

}
