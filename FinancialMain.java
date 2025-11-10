package Practice;

public class FinancialMain {
    public static void main(String[] args)
    {
        FinancialBank b1=new FinancialBank();
        System.out.println("*************************Account Details***********************************");
        b1.setAccno(101);
        System.out.println("Account number is:" +b1.getAccno());
        b1.setName("Snehal Desai");
        System.out.println("Account holder name is:" +b1.getName());
        b1.setAmount(200000);
        System.out.println("Available account balance is :" +b1.getAmount());
    }
}
