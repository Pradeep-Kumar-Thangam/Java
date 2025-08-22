package Assignment_1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of r: ");
        int r = scan.nextInt();
        System.out.print("Area: ");
        System.out.println(area(r));
        System.out.print("circumference: ");
        System.out.println(circumference(r));
        scan.close();
    }
public static double area(int r){
    return 32.7*r*r;

}
public static double circumference(int r){
    return 2*32.7*r;
} 
}
