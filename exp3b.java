
import java.util.*;

class Square implements Runnable{
    public int x;
    
    public Square(int num){    // Parameterized Constructor
        x=num;
    }
    
    public void run(){        // Thread 2
        System.out.println("Thread 2: Square of "+x+" is "+x*x);
    }
}

class Cube implements Runnable{
    public int x;

    public Cube(int num){       // Parameterized Constructor
        x=num;
    }

    public void run(){      // Thread 3
        System.out.println("Thread 3: Cube of "+x+" is "+x*x*x);
    }
}

class Generate implements Runnable{
    
    public void run(){   // Thread 1
        int num=0;
        Random r=new Random();
        try {
            for(int i=0;i<5;i++){
                num=r.nextInt(100);
                System.out.println("Thread 1: Generated Random Number is :"+num);
                Thread t1=new Thread(new Square(num));
                t1.start();
                Thread t2=new Thread(new Cube(num));
                t2.start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class exp3b{
    public static void main(String[] args) {
        Generate g=new Generate();
        Thread t=new Thread(g);
        t.start();
    }
}