//Java Program to Check Even or Odd Integers
package versity_problems;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a 1st number:");
        int a=scanner.nextInt();

        if(a%2==0){
            System.out.println("It is Even Number");
        }else{
            System.out.println("It is Odd Number");
        }
    }
}
