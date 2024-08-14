
package javacode1.ifelse2;

import java.util.Scanner;
public class Ifelse2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter any number:");
        num =input.nextInt();
        
          if(num == 0){
                System.out.println("ZERO");
            }else if(num ==1){
                System.out.println("ONE");
            }else if(num ==2){
                System.out.println("TWO");
            }else if(num ==3){
                System.out.println("THREE");
            }else if(num ==4){
                System.out.println("FOUR");
            }else if(num ==5){
                System.out.println("FIVE");
            }else if(num ==6){
                System.out.println("SIX");
            }else if(num ==7){
                System.out.println("SEVEN");
            }else if(num ==8){
                System.out.println("EIGHT");
            }else if(num ==9){
                System.out.println("NINE");
            }else{
                System.out.println("Number should be 0-9");
            }
    }
}
