/*
Encapsulation - You are developing a Bank Account System for a financial institution. Each bank account has sensitive information like:
Account Holder’s Name
Account Number
Balance
To protect this data, the system should:
Hide the data using private variables
Allow access only through public getter and setter methods
 */

package Practice;

public class FinancialBank {
    private int accno;
    String name;
    private double amount;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
