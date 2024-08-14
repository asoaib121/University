#include <stdio.h>
#include <math.h>

#define MAX_X 10  // Adjust this for the desired x-axis range

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
    double points[3][2] = {{1, 3}, {2, 5}, {3, 8}};
    double coefficients[3];

    solve_quadratic(points, coefficients);

    printf("Coefficients: a2 = %.2f, a1 = %.2f, a0 = %.2f\n",
           coefficients[0], coefficients[1], coefficients[2]);

    // Prepare data for gnuplot
    FILE *gp = fopen("polynomial.dat", "w");
    for (int x = 0; x <= MAX_X; x++) {
        double y = coefficients[0] * pow(x, 2) + coefficients[1] * x + coefficients[2];
        fprintf(gp, "%d %f\n", x, y);
    }
    fclose(gp);

    // Call gnuplot to plot the function
    system("gnuplot -p -e \"set title 'Polynomial Function'; set xlabel 'X'; set ylabel 'Y'; plot 'polynomial.dat'\"");

    return 0;
}
