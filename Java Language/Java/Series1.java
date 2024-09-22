
package javacode1.series1;

import java.util.Scanner;
public class Series1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum=1;
        System.out.print("Enter the Number:");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
        sum=sum+(i*i);
        System.out.print(i+"*"+i+" ");
        }
        System.out.println();
        System.out.println("Series Summition is:"+sum);
    }
}
