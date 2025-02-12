import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int a,res,temp;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        temp=a;
        while (a > 0)
        {
            res = a % 10;
            a = a / 10;
            sum = sum + (res * res * res);
        }

        if(sum==temp)
            System.out.println("ArmstrongNumber");
        else
            System.out.println("Not Armstrong Number");




        }
    }

