
package javacode1.timetable;
import java.util.Scanner;
public class TimeTable {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        int result=1;
        System.out.print("Enter any 1st number:");
        a=input.nextInt();
        
        System.out.print("Enter any 2nd number:");
        b=input.nextInt();
       
        
        for(int i=b;i<=10;i++)
        {
            result=a*i;
        System.out.println(a+"x"+i+"="+result);
        
        }
       
    }
}
