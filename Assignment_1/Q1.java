package Assignment_1;
import java.lang.System;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);{
            System.out.print("Enter your Name:");
            String Name = scan.nextLine();
           
            System.out.print("Enter your age:");
            int Age = scan.nextInt();
           
            System.out.print("Enter your height:");
            float Height = scan.nextFloat();

            System.out.println("Name: " + Name);
            System.out.println("Age: " + Age);
            System.out.print("Height: " + Height);

            scan.close();
             
        }
    }
    
}
