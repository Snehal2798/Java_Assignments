package Practice;

public class Operators {
    public static void main(String args[])
    {
        float price=1100;
        int quantity=12000;
        String discount_applies="Discount not applies";
        String discount_not_applies="Discount not applies";
        double subtotal=price*quantity;
        System.out.println("Subtotal is :" + (long)subtotal);
        if(subtotal>1000)
        {
            double discountedamount=subtotal*10/100;
            double finalprice=subtotal-discountedamount;
            System.out.println("The discounted amount is: " + (long)finalprice);
            if (discountedamount>1000 && quantity>5)
            {
                System.out.println("User is eligibal for free gift");
            }
            String max = (subtotal > 1000) ? discount_applies : discount_not_applies;
            System.out.println("Discount is :" +max);
        }

    }
}
