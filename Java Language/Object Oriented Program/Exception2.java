package JavaOop;

import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        int count=0;
       do{
         try {
            Scanner input = new Scanner(System.in);
        int num1, num2;
            System.out.print("Please Enter an num1: ");

            num1 = input.nextInt();

            System.out.print("Please enter an num2: ");
            num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println("Result " + num1 + "/" + num2 + "=" + result);
            System.out.println("\n");
            count=1;

        } catch (Exception c) {
            System.out.println("Exception: " + c);
            System.out.println("You musr Enter integer.please try again");
             System.out.println("\n");
        }   
       }while(count==0);
       

    }

}
