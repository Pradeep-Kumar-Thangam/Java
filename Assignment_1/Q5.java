package Assignment_1;

public class Q5 {
    public static void main(String[] args){
        int a = 15, b = 12, c = 18;
        if(a>b && a>c){
            System.out.print("The largest value is : " + a);
        }
        else if(b>c){
            System.out.print("The largest value is : " + b);
        }
        else{
            System.out.print("The largest value is : " + c);
        }
    }
}
