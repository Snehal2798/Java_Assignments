/*
java_S2A1_DataTypesAndVariable

- You are designing a basic Library Management System for a small community library. The system needs to store and display information about books, library members, and borrowing status.

As a Java developer, your task is to declare and initialize variables using appropriate data types to represent the following real-world information:

Book Details

Title of the book

Author’s name

Year of publication

Price of the book

Whether the book is currently available or not

Member Details

Name of the member

Member ID number

Type of membership (Adult, Child, or Senior represented by characters A, C, S)

Borrowing Status

Number of days the book has been borrowed

Fine per extra day (after 3 days free)

Total fine to be paid

 Task:
Write a Java program to declare variables using correct data types for each piece of information. Initialize these variables with sample data and print the details in a well-formatted output.

 */

package Practice;

public class Datatypes {
    public static void main(String args[])
    {
        System.out.println("\n");
        System.out.println("********************\tBook Details\t***********************" +"\n");
        String title_of_book="Effective Java";
        System.out.println("Title of the book is:" +"     " +title_of_book);
        String Author_Name="Joshua Bloch";
        System.out.println("Author's Name is :"+"        " +Author_Name);
        int Year_of_Publication=2001;
        System.out.println("Year of publication is :"+"  "+Year_of_Publication);
        int price =800;
        System.out.println("Price of the book is :"+"    "+price);
        boolean Is_Available=true;
        System.out.println("The book is currently :"+"   "+Is_Available +"\n");
        System.out.println("***************\tMember Details\t***********************" +"\n");
        String Name_of_Member="Snehal Desai";
        System.out.println("Name of the member is :"+"   "+Name_of_Member);
        int id=101;
        System.out.println("Id of the member is :"+"     "+id);
        char type_of_member='A';
        System.out.println("Type of the membership (Adult, Child, or Senior by characters A, C, S):"+"   " +type_of_member +"\n");
        System.out.println("*******************\tBorrowing status\t*******************" +"\n");
        int Num_of_Days=4;
        System.out.println("Number of days the book has been borrowed:"+"   "+Num_of_Days);
        double fine_per_extra_Day=10.5;
        System.out.println("Fine per extra day (after 2 days free):"+"      "+fine_per_extra_Day);
        double total_fine=10.5;
        System.out.println("Total fine need to be paid:"+"                  "+total_fine);
    }
}
