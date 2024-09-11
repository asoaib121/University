

package javacode1.primeornot;
import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int num=input.nextInt();
        for(int i=2;i<num;i++)
        {
        if(num%2==0)
        {
        System.out.println("The number is even");
        break;
        }else{
        System.out.println("The number is odd");
        break;
        }
        }
    }
}
