package Java1;
import java.lang.System;
import java.util.Scanner;
public class hello {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);{
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        scan.nextLine();
        String Address = scan.nextLine();
        System.out.println("My name is:" + Name);
        System.out.println("My age is:" + Age);
        System.out.print("My address is:" + Address);
        scan.close();
        
        }
    }
}