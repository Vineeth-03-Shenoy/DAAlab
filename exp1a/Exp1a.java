
import java.util.Scanner;

public class Exp1a {

    public static void main(String[] args) {
        
        //Enter the total number of stduents
        System.out.println("Enter the total number of students: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //Create n objects
        Student[] st=new Student[n];
        for(int i=0;i<n;i++)
            st[i] = new Student();
        
        //Read the n Student information
        for(int i=0;i<n;i++){
            System.out.println("Enter the USN, Name, Branch, Phno for Student "+(i+1));
            st[i].read();
        }
        
        //Display the Student information
        System.out.println("\nUSN\tNAME\tBRANCH\tPHNO");
        for(int i=0;i<n;i++)
            st[i].display();
    }
}
