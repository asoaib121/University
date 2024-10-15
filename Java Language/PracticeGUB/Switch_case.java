package problem_solving;

import java.util.Scanner;


public class Switch_case {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        System.out.print("Please Enter Color Code:");
        num= input.nextInt();
        
        switch(num) {
            case 000:
             System.out.println("Black");
             break;
            case 001:
            System.out.println("Blue");
            break;
             case 010:
             System.out.println("green");
             break;
            case 011:
            System.out.println("Cadmium green");
            break;
            
             case 100:
             System.out.println("Red");
             break;
            case 101:
            System.out.println("Megenda");
            break;
             case 110:
             System.out.println("Yellow");
             break;
            case 111:
            System.out.println("White");
            break;
            default:
                System.out.println("Please input correct code ");
                break;
                    
        
        
        }
    }
}
