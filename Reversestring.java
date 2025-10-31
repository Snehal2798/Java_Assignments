/*

You are building a basic password encryption feature for a login system in a mobile app. For demonstration purposes, the system simply reverses the entered password before storing it, simulating a basic encoding method

 */

package Practice;

import java.util.Scanner;

public class Reversestring {
    public static void main(String args[])
    {
        String email="";
        String pass="";
        String rev="";
        Scanner sc=new Scanner(System.in);

        System.out.println("************Instagram************");
        System.out.print("Enter email id or phone number : ");
        email=sc.nextLine();
        System.out.print("Enter your password :");
        pass=sc.nextLine();
        for(int i=pass.length()-1;i>=0;i--)
        {
            //String rev="";
            rev=rev+pass.charAt(i);

        }
        pass=rev;
        System.out.println("Encrypted password is:" +pass);
        sc.close();
    }
}
