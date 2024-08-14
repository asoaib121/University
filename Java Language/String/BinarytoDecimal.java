
package String;

import java.util.Scanner;


public class BinarytoDecimal {

    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        
        String Binary=a.next();
        Integer decimal=Integer.parseInt(Binary,2);
        
        System.out.println("decimal Number= "+decimal);
        
        
        Scanner b=new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        
      int decimalnumber=b.nextInt();
        String binary=Integer.toBinaryString(decimalnumber);
                System.out.println("Binary Number= "+binary);
            
    }
    
}
