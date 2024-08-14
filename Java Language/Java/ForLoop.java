
package javacode1.forloop;

import java.util.Scanner;
public class ForLoop {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Enter any number:");
        a=input.nextInt();
        for(int i=0;i<=a;i++)
        {
        System.out.println(i+"-Bangladesh");
        }
    }
}
