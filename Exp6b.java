
import java.util.*;

public class Exp6b {
    public static void main(String[] args) {
        
        int i,j=0,maxqty,m,n;
        float sum=0,max;
        int[][] array=new int[2][20];
        Scanner sc=new Scanner(System.in);

        /* INPUT  */
        System.out.println("\n Enter the number of items: ");
        n=sc.nextInt();
        System.out.println("\nEnter the weight of each item: ");
        for(i=0;i<n;i++) array[0][i]=sc.nextInt();
        System.out.println("\nEnter the value of each item: ");
        for(i=0;i<n;i++) array[1][i]=sc.nextInt();
        System.out.println("\nEnter the KnapSack Capacity: ");
        maxqty=sc.nextInt();

        /* GREEDY SOLUTION */
        m=maxqty;
        System.out.println("");
        while(m>=0){
            max=0;
            for(i=0;i<n;i++){
                if(((float)array[1][i])/((float)array[0][i]) > max){
                    max=((float)array[1][i])/((float)array[0][i]);
                    j=i;
                }   //end if
            }   //end for

            if(array[0][j] > m){
                System.out.println("Quantity of item no "+(j+1)+" added is "+m);
                sum+=m*max;
                m=-1;
            }
            else{
                System.out.println("Quantity of item no "+(j+1)+" added is "+array[0][j]);
                m-=array[0][j];
                sum+=(float)array[1][j];
                array[1][j]=0;
            }
        }   //end while

        System.out.println("\nThe total Profit is: "+sum+"\n");
    }    //end main()

}
