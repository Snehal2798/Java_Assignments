/*
- In a Hospital Management System, there is a base class called Person that holds basic information like:
Name
Age
Then there's a subclass called Doctor that extends Person and adds more specific data:
Specialization
Hospital Name
Now, the subclass Doctor needs to:
Call the constructor of the Person class to initialize inherited data → super()
Access/display the parent class variables or methods from the child class → super.variable or super.method()
This is a classic use case for the super keyword.
 */

package Practice;

import java.security.PublicKey;

class Person {
    String name;
    int age;
    public  Person(String name, int age){
        this.age=age;// Riya
        this.name=name;//25
    }
    public void displayInfo()
    {
        System.out.println("Dr. name is:"+ name);
        System.out.println("Dr. age is :" + age);
    }
}
class Doctor extends Person{
    String specialization;
    String hospitalname;

    public  Doctor(String name, int age, String specialization, String hospitalname){
        super(name,age);
        this.hospitalname=hospitalname;//vadiya
        this.specialization=specialization;//Endoc
    }
    public void displayInfo()
    {
        System.out.println("**************HOSPITAL MANAGEMENT SYSTEM*********************");
        System.out.println("Dr. name is:"+ super.name);
        System.out.println("Dr. age is :" +super.age);
        super.displayInfo();
        System.out.println("Dr's specilaization  is :" +specialization);
        System.out.println("Dr's hospital name  is :" +hospitalname);
        System.out.println("----------------------------------");
    }
}

public class Superkeyword {
    public static void main(String args[])
    {
        Doctor d1=new Doctor("Riya",25,"Endoscopist","Vadiya Hospital");
        d1.displayInfo();
        Doctor d2=new Doctor("Yuya",26,"Gynic","7 Hills Hospital");
        d2.displayInfo();
        Doctor d3=new Doctor("Ajay",27,"Othopedic","TATA Hospital");
        d3.displayInfo();
    }
}
