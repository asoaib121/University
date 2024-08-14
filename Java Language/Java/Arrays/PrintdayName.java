package Arrays;

import java.util.Scanner;

public class PrintdayName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter day numbr 1 to 7: ");
        int m=input.nextInt();
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String y = day[0];
        
      
        for (String x:day) {
          
              y = day[m];
            
        }
        System.out.println("The day: " + y);
    }

}
