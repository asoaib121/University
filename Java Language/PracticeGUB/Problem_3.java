//Java Program to Multiply Two Floating-Point Numbers
package versity_problems;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your first floating number: ");
        float a=scanner.nextFloat();

        System.out.println("Enter your second floating number: ");
        float b=scanner.nextFloat();

        System.out.println("Multiply two floating number :"+a*b);
    }
}
