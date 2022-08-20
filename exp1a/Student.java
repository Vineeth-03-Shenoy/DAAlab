
import java.util.Scanner;

public class Student {

    private String usn,name,branch,phno;
    
    //Method to Read Student Data
    public void read(){
        Scanner sc=new Scanner(System.in);
        usn = sc.nextLine();
        name = sc.nextLine();
        branch = sc.nextLine();
        phno = sc.nextLine();
    }
    
    //Method to Display Student Data
    public void display(){
        System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phno);
    }
}
