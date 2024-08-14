

package LowtoHigh;

import java.util.Scanner;


public class Pattern {

   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int m;
       System.out.print("Enter a number:");
       m=input.nextInt();
       
       for(int i=1;i<=m;i++){
           System.out.println();
           for(int j=1;j<=i;j++)
           System.out.print(" "+j%2);
             }
      
    }
}
