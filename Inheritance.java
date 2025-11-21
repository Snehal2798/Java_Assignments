/*
Salary Management System using Object-Oriented Programming with inheritance, involving Employee and Manager classes.
Scenario:
You're creating a salary management program for a company. There are two types of people:
Employees: Have basic details like name, ID, and base salary.
Managers: Are also employees but get additional bonuses and perks."
 */


package Practice;

class employee{
    String name;
    int id;
    int salary;

}
class manager extends employee{
    double bonus;
    double travelingAllowance;
    void displayDetailsn()
    {
        System.out.println("*****************************SALARY MANAGEMENT SYSTEM**********************");
        System.out.println("Employee id is: " +id);
        System.out.println("Employee Name is :" +name);
        System.out.println("Employee Salary is: " +salary);
        System.out.println("Diwali bonus :" +bonus);
        System.out.println("Travelling allowance :" +travelingAllowance);
    }
}

public class Inheritance {
    public static void main(String args[])
    {
        manager obj=new manager();
        obj.name="Snehal";
        obj.id=101;
        obj.salary=40000;
        obj.bonus=3000;
        obj.travelingAllowance=1000;
        obj.displayDetailsn();

    }
}
