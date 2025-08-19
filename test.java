import java.lang.System;
import java.util.Scanner;
public class test{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);{
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int d = a*b*c;
        System.out.println("The value of d is:" + d);
        int e = a+b+c;
        System.out.println("The value of e is:" + e);
        System.out.print("Answer is:" + d/e);

        }
    }    
}