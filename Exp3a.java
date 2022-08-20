
import java.util.Scanner;

public class Exp3a {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the numerator: ");
            a=sc.nextInt();
            System.out.println("Enter the denominator: ");
            b=sc.nextInt();
            c=a/b;
            System.out.println("NO EXCEPTION\n Value of a/b = "+c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }   
    }
}
