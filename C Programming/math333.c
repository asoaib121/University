#include <stdio.h>
#define MAX_SIZE 10

void swap_rows(float matrix[][MAX_SIZE], int row1, int row2, int n) {
    for (int i = 0; i < n; i++) {
        float temp = matrix[row1][i];
        matrix[row1][i] = matrix[row2][i];
        matrix[row2][i] = temp;
    }
}

int main() {
    int n;

    printf("Enter the number of equations (matrix size): ");
    scanf("%d", &n);

    if (n > MAX_SIZE) {
        printf("Error: Matrix size exceeds limit (%d).\n", MAX_SIZE);
        return 1;
    }

    float matrix[MAX_SIZE][MAX_SIZE];

    printf("Enter the augmented matrix coefficients:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n + 1; j++) {  // Include the augmented column
            scanf("%f", &matrix[i][j]);
        }
    }

    // Gaussian Elimination
    for (int i = 0; i < n - 1; i++) {
        int pivot_row = i;  // Initialize pivot row as the current row

        // Find the row with the largest leading coefficient in the current column
        for (int j = i + 1; j < n; j++) {
            if (fabs(matrix[j][i]) > fabs(matrix[pivot_row][i])) {
                pivot_row = j;
            }
        }

        // Check for singular matrix (no leading coefficient)
        if (fabs(matrix[pivot_row][i]) < 1e-6) { // Tolerance for small values
            printf("Error: No solution exists (singular matrix).\n");
            return 1;
        }

        // Swap rows if necessary
        if (pivot_row != i) {
            swap_rows(matrix, i, pivot_row, n);
        }

        // Forward elimination
        for (int j = i + 1; j < n; j++) {
            float factor = matrix[j][i] / matrix[i][i];
            for (int k = i; k < n + 1; k++) {  // Include the augmented column
                matrix[j][k] -= factor * matrix[i][k];
            }
        }
    }

    // Back substitution
    float solution[n];
    for (int i = n - 1; i >= 0; i--) {
        float sum = 0;
        for (int j = i + 1; j < n; j++) {
            sum += solution[j] * matrix[i][j];
        }
        solution[i] = (matrix[i][n] - sum) / matrix[i][i];
    }

    printf("Solution:\n");
    for (int i = 0; i < n; i++) {
        printf("x%d = %.2f\n", i + 1, solution[i]);
    }

    return 0;
}
