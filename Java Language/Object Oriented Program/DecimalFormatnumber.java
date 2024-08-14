
package javacode1.oop;

import java.text.DecimalFormat;


public class DecimalFormatnumber {

  
    public static void main(String[] args) {
        
        DecimalFormat ab=new DecimalFormat("0.000");
        double a=3.32993;
        System.out.println("Decimal Format Number: "+ab.format(a));
        
    }
    
}
