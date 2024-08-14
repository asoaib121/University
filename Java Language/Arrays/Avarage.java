
package Arrays;

import java.util.Scanner;
public class Avarage {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        double[]num = new double[5];
        double sum=0;
        System.out.print("Please enter the number: ");
        
        
        for(int i=0;i<num.length;i++)
        {
        num[i]=input.nextDouble();
        }
        
        for(int i=0;i<num.length;i++)
        {
        sum=sum+num[i];
        }
        System.out.println("Avarage number  is: "+sum/num.length);
        
    }
    
}
