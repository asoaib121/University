package Arrays;

import java.util.Scanner;

public class DiogonalMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the matrix number: ");
        int[][] A = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("The matrix of A is: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println();
        }

        int SumofDigonal = 0;
        int SumofUpper = 0;
        int SumofLowerElement = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumofDigonal = SumofDigonal + A[row][col];
                }
                if (row < col) {
                    SumofUpper = SumofUpper + A[row][col];
                }

                if (row > col) {
                    SumofLowerElement = SumofLowerElement + A[row][col];
                }

            }
        }

        System.out.println("Sum of Diogonal Matrix is: " + SumofDigonal);
        System.out.println("Sum of upper Matrix is: " + SumofUpper);
        System.out.println("Sum of lower Matrix is: " + SumofLowerElement);

    }
}
