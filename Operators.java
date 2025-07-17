//java_S3A1_typesOfOperator
//
//- Imagine you are building a Billing System for a local grocery store. At checkout, the system needs to calculate the total bill based on the number of items, apply discounts, and determine whether a customer is eligible for a special offer
//
//To implement this, your program needs to use different types of operators in Java:
//
//Arithmetic Operators
//
//To calculate the total price of items (quantity × price)
//
//To apply discounts
//
//Relational (Comparison) Operators
//
//To check if the customer qualifies for a discount (e.g., if total > 1000)
//
//Logical Operators
//
//To check if the customer qualifies for a special offer (e.g., spends more than ₹1000 and buys more than 5 items)
//
//Assignment Operators
//
//To assign calculated values to variables
//
//Unary Operators
//
//To increase the item count by 1 if an extra item is added
//
//Ternary Operator
//
//To apply a discount conditionally
//
// Task:
//
//Write a Java program using variables and operators to perform the following actions:
//
//Take sample data for item price and quantity
//
//Calculate the subtotal using arithmetic operators
//
//Apply a 10% discount if the subtotal exceeds ₹1000
//
//Check if the user is eligible for a "Free Gift" if they spend more than ₹1000 and buy more than 5 items
//
//Use a ternary operator to determine if a discount applies
//
//Output all calculated information clearly


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
