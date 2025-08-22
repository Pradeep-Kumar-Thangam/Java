package Assignment_1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the value of n:" );
        int n = scan.nextInt();
        int a = 0,b = 1;
        System.out.print(a+" "+b);
        for(int i=1; i<=n; i++) {
            int c = a+b;
            System.out.print(" " +c);
            a = b;
            b = c;
        }

        scan.close();
    }
    
}
