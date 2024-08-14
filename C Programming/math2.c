#include <stdio.h>

void multiplyMatrix(int mat1[][3], int mat2[][3], int res[][3], int rows1, int cols1, int cols2) {
    // Check for compatible matrix dimensions for multiplication
    if (cols1 != cols2) {
        printf("Error: Incompatible matrix dimensions for multiplication.\n");
        return;
    }

    // Perform matrix multiplication
    for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < cols2; j++) {
            res[i][j] = 0;
            for (int k = 0; k < cols1; k++) {
                res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
}

// Assuming `encodeMessage` is not relevant to the current task, remove it.

void printEncodedMatrix(int matrix[][3], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int A[3][3] = {{1, -1, 1},
                   {1,  1,  0},
                   {1,  2,  1}};

    int numbers[5][3] = {{1,  2,  2},
                         {18,  5, 22},
                         {5, 227,  0},
                         {9,   1, 20},
                         {19,  0,  0}};

    int encoded[5][3];

    // Call multiplyMatrix with correct dimensions
    multiplyMatrix(numbers, A, encoded, 5, 3, 3);

    printf("Encoded Matrix:\n");
    printEncodedMatrix(encoded, 5, 3);

    return 0;
}
