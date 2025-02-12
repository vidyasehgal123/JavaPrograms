import java.util.Scanner;

public class swaptwonumberswithouttemp
{
    public static void main (String[] args){
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number a");
        a=input.nextInt();
        System.out.println("Enter number b");
        b=input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped a" +a);
        System.out.println("Swapped b" +b);

    }



}
