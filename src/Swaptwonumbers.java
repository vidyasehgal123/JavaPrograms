import java.util.Scanner;

public class Swaptwonumbers
{
    public static void main (String[] args)
    {
        int a,b,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        a=input.nextInt();
        System.out.println("Value of a before"+a);
        b=input.nextInt();
        System.out.println("Value of b before"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a after"+a);
        System.out.println("Value of b after"+b);



    }
}
