package Arrays;

import java.util.Scanner;

public class SumofMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a matrix of A: ");
        int[][] A = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("A matrix is:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  " +A[row][col]);
            }
           System.out.println();
        }
        System.out.println("\n");
        
        
        
         System.out.println("Enter a matrix of B: ");
        int[][] B = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                B[row][col] = input.nextInt();
            }
        }

        System.out.println("B matrix is:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  " +B[row][col]);
            }
           System.out.println();
        }
        System.out.println("\n");
        
        
        
    
        int[][] sum= new int[2][3];
        

        

        System.out.println("The Summition is:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sum[row][col]=A[row][col]+B[row][col];
                System.out.print("  " +sum[row][col]);
            }
           System.out.println();
        }
        
        
    }

}
