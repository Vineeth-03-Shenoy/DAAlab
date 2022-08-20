
import java.util.*;

public class Exp10b {

    int[][] d;
    int[] visited,finaltour;
    int n,cost;

    void read(){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Cities: ");
        n=sc.nextInt()+1;           // REMEMBER that INPUT IS n+1, i.e:-   n=sc.nextInt() + 1 
        d=new int[n][n];
        System.out.println("Enter the Distance Matrix: ");
        for(i=1;i<n;i++)
            for(j=1;j<n;j++)
                d[i][j]=sc.nextInt();
        visited=new int[n];
        finaltour=new int[n];
        for(i=1;i<n;i++){
            visited[i]=0;
            finaltour[i]=i;
        }
    }

    int tsp_dp(int start,int[] tour){
        int i,j,k;
        int[] temp=new int[n];
        int[] mintour=new int[n];
        int mincost,ccost;

        if(start==n-2) return d[tour[n-2]][tour[n-1]]+d[tour[n-1]][1];  // { d[tour(n-2)][tour(n-1)] }  +  { d[tour(n-1)][1] }
        
        mincost=99;

        for( i=start+1 ; i<n; i++){
            for(j=1;j<n;j++)    temp[j]=tour[j];
            
            temp[start+1]=tour[i];
            temp[i]=tour[start+1];

            if( d[tour[start]][tour[i]] + (ccost=tsp_dp(start+1, temp)) < mincost){
                mincost = d[tour[start]][tour[i]]+ccost;
                for(k=1;k<n;k++)    mintour[k]=temp[k];
            }
            else{
                int t=d[tour[start]][tour[i]]+ccost;
            }
        }

        for(i=1;i<n;i++)    tour[i]=mintour[i];
        return mincost;

    }

    void findoptpath(){
        cost=tsp_dp(1, finaltour);
        System.out.println("\nTraversal Path using Dynammic Programming: ");
        for(int i=1;i<n;i++)    System.out.print(finaltour[i]+" --> ");
        System.out.println("1");
        System.out.println("\n Minimun Cost: "+cost+"\n");

    }

    public static void main(String[] args) {
        Exp10b tsp=new Exp10b();
        tsp.read();
        tsp.findoptpath();
    }

}
