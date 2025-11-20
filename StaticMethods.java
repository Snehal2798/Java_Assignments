/*
You are building a School Admission System where:
Every time a student is admitted, they get a unique admission number.
The total number of students admitted so far should be tracked.
This count of total students should be shared across all student objects, which makes it a perfect use case for a static variable.
A static method will be used to display the total number of students admitted so far — this method can be called without creating an object.
 */

package Practice;

public class StaticMethods
{

    String studentName;
    int admissionNumber=0;
    static int totalNumberOfStudents=0;

    public StaticMethods(String name, int id)
    {
        studentName=name;
        admissionNumber=id;
    }
    public static void setTotalNumberOfStudents()
    {
        totalNumberOfStudents++;
        System.out.println("Total number of Students: "  +totalNumberOfStudents);
    }
    public void displayStudents()
    {
        System.out.println("************************STUDENT ADMISSION SYSTEM***********************");
        System.out.println("Student name is :" +studentName);
        System.out.println("Student admission number is:" +admissionNumber);
        setTotalNumberOfStudents();
    }
    public static void main(String[] args)
    {
        StaticMethods m1=new StaticMethods("Snehal",101);
        m1.displayStudents();
        StaticMethods m2=new StaticMethods("Riya", 103);
        m2.displayStudents();
        StaticMethods m3=new StaticMethods("Vivek", 104);
        m3.displayStudents();

    }
}
