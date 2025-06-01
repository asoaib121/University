//Java Program to Get Input from the User
package versity_problems;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=scanner.nextLine();
        System.out.println("My name is"+a);

        System.out.println("Enter Your age: ");
        int b=scanner.nextInt();
        System.out.println("My age:"+b);
    }
}
