package Assignment_1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the required action: ");
        String Action = scan.nextLine();
        switch(Action){
            case "add" :
            System.out.print(a+b);
            break;
            
            case "sub" :
            System.out.print(a-b);
            break;
           
            case "multiple" :
            System.out.print(a*b);
            break;
            
            case "div" :
            System.out.print(a/b);
            break;

            case "modules" :
            System.out.print(a%b);
            break;

            default:
            System.out.print("No more actions to perform");
            break;
        }
        scan.close();
    }
}
