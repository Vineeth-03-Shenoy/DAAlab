
import java.util.*;

public class Exp6a {

    public void calculate(int[] wt,int[] val,int W,int n){

        int i,j;
        int[][] F=new int[n+1][W+1];
        for(i=0;i<=n;i++){
            for(j=0;j<=W;j++){
                if( i==0 || j==0) F[i][j]=0;
                else{
                    if(j<wt[i]) F[i][j]=F[i-1][j];
                    else F[i][j]=Math.max(F[i-1][j-wt[i]]+val[i], F[i-1][j]);
                }  //end of else
            }  //end of inner for
        } //end of for

        System.out.println("\nOptimal Value is : "+F[n][W]);
        if(F[n][W]==0) System.out.println("\nNO optimal Solution");
        else{
            System.out.println("\nOptimal Subset");
            for( i=n ; i>0&&W>0 ; i--){
                if(F[i][W]!=F[i-1][W]){
                    System.out.println(i+" ");
                    W=W-wt[i];
                }  //end of if
            } //end of for 
        } //end of else

    }  //end of calculate()

    public static void main(String[] args) {       //main 
        int i;

        Scanner sc=new Scanner(System.in);
        Exp6a ks=new Exp6a();

        System.out.println("Enter the number of items: ");
        int n=sc.nextInt();
        int[] wt=new int[n+1];
        int[] val=new int[n+1];

        System.out.println("\nEnter the weight for "+n+" items:");
        for(i=1;i<=n;i++) wt[i]=sc.nextInt();

        System.out.println("\nEnter the Profit/Values for "+n+" items:");
        for(i=1;i<=n;i++) val[i]=sc.nextInt();

        System.out.println("\nEnter the KnapSack Capacity : ");
        int W=sc.nextInt();

        ks.calculate(wt, val, W, n);
    }
}
