/*
-You’re developing a Shopping Cart System where:
Each customer has their own cart.
Each cart contains information like the customer name and the total price of their selected items.
Since each cart is specific to a customer, all data and methods should be non-static (i.e., specific to each object).
 */

package Practice;

public class NonStatic {
    String customerName;
    int totalPrice;
    int selectedItems;

    public NonStatic(String name,int items, int price)
    {
        customerName=name;
        selectedItems=items;
        totalPrice=price;
    }
    public void displayCart()
    {
        System.out.println("****************SHOPPING CART****************************");
        System.out.println("The name of the customer is :" +customerName);
        System.out.println("Number of selected items:" +selectedItems);
        System.out.println("Total price is :" +totalPrice);
    }
    public static void main(String args[])
    {
        NonStatic n1=new NonStatic("Snehal", 12, 4000);
        n1.displayCart();
        NonStatic n2=new NonStatic("Vivek", 9, 9000);
        n2.displayCart();
        NonStatic n3=new NonStatic("Riya", 12, 4000);
        n3.displayCart();
    }

}
