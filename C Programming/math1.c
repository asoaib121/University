#include <stdio.h>
// Define the given points
double points[3][2] = {{1, 3}, {2, 5}, {3, 8}};

// Function to calculate the coefficients of a quadratic polynomial
void solve_quadratic(double points[3][2], double coefficients[3]) {
    double sum_x = 0, sum_x2 = 0, sum_y = 0, sum_xy = 0, sum_x2y = 0;
    for (int i = 0; i < 3; i++) {
        sum_x += points[i][0];
        sum_x2 += points[i][0] * points[i][0];
        sum_y += points[i][1];
        sum_xy += points[i][0] * points[i][1];
        sum_x2y += points[i][0] * points[i][0] * points[i][1];
    }
    // Solve system of equations for quadratic coefficients (a2, a1, a0)
    coefficients[0] = (sum_x2y - sum_xy * sum_x) / (sum_x2 * sum_x - sum_x * sum_x);
    coefficients[1] = (sum_y * sum_x2 - sum_x * sum_xy) / (sum_x2 * sum_x - sum_x * sum_x);
    coefficients[2] = (sum_y * sum_x - sum_xy * sum_x2) / (sum_x2 * sum_x - sum_x * sum_x);
}
int main() {
    double coefficients[3];
   solve_quadratic(points, coefficients);

    // Print the coefficients
    printf("Coefficients: a2 = %.2f, a1 = %.2f, a0 = %.2f\n",
           coefficients[0], coefficients[1], coefficients[2]);

    return 0;
}
