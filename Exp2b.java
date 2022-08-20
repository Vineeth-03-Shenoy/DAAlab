
import java.util.*;

public class Exp2b {

    String cname,dob;
    Scanner sc=new Scanner(System.in);
    
    void read(){
        System.out.println("Enter Customer Name: ");
        cname=sc.next();
        System.out.println("Enter Customer DOB in dd/mm/yyyy :");
        dob=sc.next();
    }

    void display(){

        StringTokenizer st=new StringTokenizer(dob,"/");
        String s=st.nextToken();
        int d=Integer.parseInt(s);
        s=st.nextToken();
        int m=Integer.parseInt(s);
        s=st.nextToken();
        int y=Integer.parseInt(s);

        int f=1;  // f=0 if DOB is invalid, f=1 if DOB is valid

        /* if month with 31 days has been entered with date greater than 31 */
        if( m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 ) { if(d>31) f=0; }
        
        /* if month with 30 days has been entered with date greater than 30 */
        else if( m==4 || m==6 || m==9 || m==11 ) { if(d>30) f=0; }

        /* verifying february */
        else if( m==2 ){

            /* if february is in leap year, then the entered date should Not be greater than 29 days */
            if( y%400==0 || ( y%100!=0 && y%4==0 )) { if(d>29) f=0; }
            
            /* in all other years, entered date should not be greater than 28 days */
            else if(d>28) f=0;
        }

        /* if month is greater than 12 */
        else if( m>12 ) f=0;

        /* if all above 'if conditions' are false, then DOB entered is valid */
        else f=1;

        /* if f=1, DOB is valid, hence display */
        if(f==1) {
            System.out.println("\n=====Customer Details====");
            System.out.println("Customer Name, DOB:\t "+cname+" , "+d+"-"+m+"-"+y+"\n");
        }
        else System.out.println("Invalid DOB \n");
    }

    public static void main(String[] args) {
        Exp2b obj=new Exp2b();
        obj.read();
        obj.display();
    }
}
