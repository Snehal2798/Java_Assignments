// You are building a system for a school to store and analyze marks for multiple students in different subjects.
//
//For example:
//
//3 students
//
//4 subjects (Math, Science, English, History)
//
//Your task is to:
//
//Store the marks using a 2D array
//
//Display the marks in a tabular format
//
//Optionally, calculate and display each student's total marks

package Practice;

import java.util.Arrays;

public class Twodiamens {

    public static void main(String args[]) {
        String Stud[] = {"Snehal", "Snehit", "Suresh"};
        String Sub[] = {"Maths", "Science", "English", "History"};
        int S[][] = {{70, 90, 80},
                {90, 98, 70},
                {93, 90, 84},
                {79, 82, 81},};

        // Header print karnyasathi

        System.out.print("Subjects\t");
        for (int i = 0; i < Stud.length; i++) {
            System.out.print(Stud[i] + "\t");
        }
        System.out.println();

        //the subject cha nav ani Marks
        for (int i = 0; i < Sub.length; i++) {
            System.out.print(Sub[i] + "\t\t");
            for (int j = 0; j < Stud.length; j++) {
                System.out.print(S[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.print("Total" +"\t\t");
        for (int j = 0; j < Stud.length; j++)
        {
            int total = 0;
            for (int i = 0; i < Sub.length; i++)
            {
                total += S[i][j];
            }
            System.out.print(total+ "\t\t");
        }
        System.out.println();
    }
}



