import java.util.*;
public class swap{
    public static void swapping(int a , int b){

        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of a "+ a);
        System.out.println("value of b "+ b);

    }
    public static void main(String args[]){

       Scanner scan = new Scanner (System.in);
       System.out.println("enter a number ");
       int a = scan.nextInt();
        System.out.println("enter a number");
        int b = scan.nextInt();
        swapping(a,b);
        System.out.println("...............THANK YOU..................");

    }
}


































