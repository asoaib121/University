package Arrays;

import java.util.Scanner;

public class MaximumandMinimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        System.out.print("Please enter a number: ");

        for (int i = 0; i < 5; i++) {
            num[i] = input.nextDouble();
        }
        double max = num[0];
        double min = num[0];

        for (int i = 1; i < 5; i++) {
            if (max < num[i]) {
                max=num[i]; 
            }
                if (min > num[i]) {
                    min=num[i];
                }
            
        }
        System.out.println("Maximum value is: " +max);
        System.out.println("Minimum value is: "+min);
    }

}
