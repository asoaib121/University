
package javacode1.switchcase;

import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Enter any language:");
        num= input.nextInt();
        
        switch(num) {
            case 1:
             System.out.println("Bangali");
             break;
            case 2:
            System.out.println("Hindi");
            break;
             case 3:
             System.out.println("Arbi");
             break;
            case 4:
            System.out.println("Urdhu");
            break;
            default:
                System.out.println("English");
                break;
                    
        
        
        }
    }
}
