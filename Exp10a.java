
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class Exp10a {
    
    void floyd(int[][] w, int n){
        int i,j,k;
        for(k=1;k<=n;k++)
            for(i=1;i<=n;i++)
                for(j=1;j<=n;j++)
                    w[i][j]=Math.min(w[i][j], w[i][k]+w[k][j]);
    }

    public static void main(String[] args) {
        int[][] a=new int[10][10];
        int n,i,j;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of vertices: ");
        n=sc.nextInt();
        System.out.println("Enter the Weight matrix: ");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                a[i][j]=sc.nextInt();
        
        Exp10a f=new Exp10a();
        f.floyd(a, n);
        
        System.out.println("The Shortest Path matrix is: ");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
