//Java Program to Add Two Complex numbers
package versity_problems;
import java.util.Scanner;

public class Problem_6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first complex number: ");
            double r1 = sc.nextDouble(), i1 = sc.nextDouble();

            System.out.print("Enter the second complex number: ");
            double r2 = sc.nextDouble(), i2 = sc.nextDouble();

            System.out.println("Sum: " + (r1 + r2) + " + " + (i1 + i2) + "i");
        }
    }


