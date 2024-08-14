#include <stdio.h>

int main() {
    float I1, I2, I3, b1, b2;
    float detA, detI1, detI2;

    // Coefficients from the equations
    float a11 = 25.0;
    float a12 = -20.0;
    float a21 = -20.0;
    float a22 = 30.0;

    // Constants on the right-hand side
    b1 = 50.0;
    b2 = 30.0;

    // Calculate determinants
    detA = (a11 * a22) - (a12 * a21);
    detI1 = (b1 * a22) - (b2 * a12);
    detI2 = (a21 * b1) - (a11 * b2);

    // Solve for i1 and i2
    I1 = detI1 / detA;
    I2 = detI2 / detA;

    I3=I1+I2;

    printf("Solution:\n");
    printf("I1 = %.2f\n", I1);
    printf("I2 = %.2f\n", I2);
    printf("I3 = %.2f\n",I3);

    return 0;
}
