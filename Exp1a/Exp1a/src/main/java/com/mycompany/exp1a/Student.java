
package com.mycompany.exp1a;
import java.util.Scanner;
public class Student {
    private String usn,name,branch,phno;
    public void read(){
        Scanner sc=new Scanner(System.in);
        usn = sc.nextLine();
        name = sc.nextLine();
        branch = sc.nextLine();
        phno = sc.nextLine();
    }
    public void display(){
        System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phno);
    }
}
