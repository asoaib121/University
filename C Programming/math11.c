#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Define the given points
double points[3][2] = {{1, 3}, {2, 5}, {3, 8}};

// Function to solve the system of linear equations
void solve_system(double A[3][3], double B[3], double coefficients[3]) {
    // Use the least squares method to find coefficients
    // No direct equivalent to numpy's lstsq in C, so implementing a simple least squares method
    int i, j, k;
    double S[3][4] = {0};

    // Build the augmented matrix
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            for (k = 0; k < 3; k++) {
                S[j][k] += A[i][j] * A[i][k];
            }
            S[j][3] += A[i][j] * B[i];
        }
    }

    // Gaussian elimination
    for (i = 0; i < 3 - 1; i++) {
        for (j = i + 1; j < 3; j++) {
            double factor = S[j][i] / S[i][i];
            for (k = 0; k < 4; k++) {
                S[j][k] -= factor * S[i][k];
            }
        }
    }

    // Back substitution
    for (i = 3 - 1; i >= 0; i--) {
        coefficients[i] = S[i][3];
        for (j = i + 1; j < 3; j++) {
            coefficients[i] -= S[i][j] * coefficients[j];
        }
        coefficients[i] /= S[i][i];
    }
}

int main() {
    double A[3][3]; // Coefficient matrix
    double B[3];    // Constants vector
    double coefficients[3]; // Coefficients of the polynomial

    // Fill the coefficient matrix A and constant vector B
    for (int i = 0; i < 3; i++) {
        A[i][0] = 1;
        A[i][1] = points[i][0];
        A[i][2] = points[i][0] * points[i][0];
        B[i] = points[i][1];
    }

    // Solve the system of linear equations
    solve_system(A, B, coefficients);

    // Print the coefficients
    printf("Coefficients: a0 = %.4f, a1 = %.2f, a2 = %.2f\n", coefficients[0], coefficients[1], coefficients[2]);

    return 0;
}
