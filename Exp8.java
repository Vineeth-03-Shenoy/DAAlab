
import java.util.*;

public class Exp8 {
    
    int find(int v, int[] parent){
        while(parent[v]!=v)
            v=parent[v];
        return v;
    }
    
    void union(int i,int j,int[] parent){
        if(i<j)
            parent[j]=i;
        else
            parent[i]=j;
    }
    
    void kruskal(int n,int[][] cost){
        int[] parent=new int[10];
        int[][] t=new int[10][2];
        int k=0,count=0,mincost=0,i,j,min,u=0,v=0;
        for(i=1;i<=n;i++)
            parent[i]=i;
        while(count<n){
            min=99;
            for(i=1;i<=n;i++)
                for(j=1;j<=n;j++)
                    if(cost[i][j]<min && cost[i][j]!=0){
                        min=cost[i][j];
                        u=i;
                        v=j;
                    }
            if(min==99)
                break;
            i=find(u,parent);
            j=find(v,parent);
            if(i!=j){
                t[k][0]=u;
                t[k][1]=v;
                mincost=mincost+min;
                count++;
                k++;
                union(i,j,parent);
            }
            cost[u][v]=cost[v][u]=99;
        }
        if(count==n-1){
            System.out.println("Edges of the Spanning tree: ");
            for(i=0;i<=n-2;i++)
                System.out.println(t[i][0]+" , "+t[i][1]);
            System.out.println("Cost of the MIn Spanning tree = "+mincost);
        }
        else
            System.out.println("Spanning Tree Does Not Exist");
    }
    
    public static void main(String[] args) {
        int[][] cost=new int[20][20];
        int i,j,n;
        Exp8 k=new Exp8();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of nodes: ");
        n=sc.nextInt();
        System.out.println("Enter the cost matrix: ");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                cost[i][j]=sc.nextInt();
        k.kruskal(n,cost);
    }
}
