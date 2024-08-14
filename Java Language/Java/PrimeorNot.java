

package javacode1.primeornot;
import java.util.Scanner;

public class PrimeorNot {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int num=input.nextInt();
        for(int i=2;i<num;i++)
        {
        if(num%2==0)
        {
        System.out.println("Not Prime Number");
        break;
        }else{
        System.out.println("Prime Number");
        break;
        }
        }
    }
}
