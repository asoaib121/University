//Java Program to Add Two Binary Strings
package versity_problems;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a 1st number: ");
        String a= scanner.nextLine();

        int num1=Integer.parseInt(a,2);

        System.out.println("Enter a 1st number: ");
        String b= scanner.nextLine();

        int num2=Integer.parseInt(b,2);

        int sum=num1+num2;

        System.out.println("Binarry sumittion is: "+sum);

    }
}
