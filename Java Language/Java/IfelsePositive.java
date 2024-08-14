

package javacode1.ifelsepositive;

import java.util.Scanner;

public class IfelsePositive {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int num;
         System.out.print("enter any number:");
         num = input.nextInt();
         
         if(num>0) {
          System.out.println("positive");
         }
        
    }
}
