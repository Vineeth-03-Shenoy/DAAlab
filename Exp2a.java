
import java.util.*;

class staff{
    private int staffid, salary;
    private long phno;
    private String name;

    void display(){
        System.out.println();
        System.out.println("Staff ID: "+staffid);
        System.out.println("Salary: "+salary);
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phno);
    }

    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the SID, Salary, Name, Phone No: ");
        staffid = sc.nextInt();
        salary=sc.nextInt();
        name=sc.next();
        phno=sc.nextLong();
    }
}

class Teaching extends staff{
        String domain,publication;

        void read(){
            Scanner sc=new Scanner(System.in);
            super.read();
            System.out.println("Enter the Domain and Publication: ");
            domain=sc.next();
            publication=sc.next();
        }

        void display(){
            super.display();
            System.out.println("Domain: "+domain);
            System.out.println("Publication: "+publication);
        }
}

class Technical extends staff{
    String skills;

    void read(){
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter Skills: ");
        skills=sc.next();
    }

    void display(){
        super.display();
        System.out.println("Skills: "+skills);
    }
}

class Contract extends staff{
    int period;

    void read(){
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter the Contract Period: ");
        period=sc.nextInt();
    }

    void display(){
        super.display();
        System.out.println("Period: "+period);
    }
}

public class Exp2a {
    public static void main(String[] args) {
        int n,ch;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n1.Teaching\t2.Technical\t3.Contract\t4.Exit\tEnter your Choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                        System.out.println("How many teaching staff:");
                        n=sc.nextInt();
                        Teaching[] te=new Teaching[n];
                        for(int i=0;i<n;i++){
                            te[i]=new Teaching();
                            te[i].read();
                        }
                        for(int i=0;i<n;i++){
                            te[i].display();
                        }
                        break;

                case 2:
                        System.out.println("How many technical staff:");
                        n=sc.nextInt();
                        Technical[] tc=new Technical[n];
                        for(int i=0;i<n;i++){
                            tc[i]=new Technical();
                            tc[i].read();
                        }
                        for(int i=0;i<n;i++){
                            tc[i].display();
                        }
                        break;
                        
                case 3:
                        System.out.println("How many Contract staff:");
                        n=sc.nextInt();
                        Contract[] c=new Contract[n];
                        for(int i=0;i<n;i++){
                            c[i]=new Contract();
                            c[i].read();
                        }
                        for(int i=0;i<n;i++){
                            c[i].display();
                        }
                        break;

                case 4:
                        System.exit(0);

                default: 
                        System.out.println("Invalid Choice");
            }
        }
    }
    
}
