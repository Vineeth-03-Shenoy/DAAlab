
import java.util.*;

public class Exp12 {
    private int adj[][],x[],n,c=1;
    static int flag=0;

    /* Default constructor for Hamiltonian */
    public Exp12(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        n=sc.nextInt();

        adj=new int[n][n];
        x=new int[n];
        x[0]=0;

        for(int i=1;i<n;i++)    x[i]=-1;
        
        System.out.println("\nEnter the Adjacency Matrix: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                adj[i][j]=sc.nextInt();
    }

    public void nextValue(int k){
        int i=0;
        while(true){
            x[k]=x[k]+1;
            if(x[k]==n)     x[k]=-1;
            if(x[k]==-1)    return;
            if( adj[x[k-1]][x[k]] == 1){
                for(i=0;i<k;i++)
                    if(x[i]==x[k])  break;
            }
            if( i==k ){
                if( k<n-1 || k==n-1 && adj[x[n-1]][0]==1 )  return;
            }
        }
    }

    public void getHC(int k){

        while(true){
            nextValue(k);
            if(x[k]==-1)    return;
            if(k==n-1){
                System.out.println("Solution "+(c++));
                flag=1;
                for(int i=0;i<n;i++)    System.out.print((x[i]+1)+" ");
                System.out.println(1);
            }
            else    getHC(k+1);
        }
    }

    public static void main(String[] args) {
        Exp12 H=new Exp12();
        H.getHC(1);
        if(flag==0) System.out.println("No Solution\n");
    }

}
