#include <stdio.h>

int main() {
    float principal = 100; // Initial principal amount
    float rate = 6.0 / 100; // Annual interest rate (6% converted to decimal)
    int years = 3; // Number of years

    // Calculate the amount after 3 years using the formula: A = P * (1 + r)^n
    float amount = principal * pow(1 + rate, years);

    printf("Amount after %d years: %.2f taka\n", years, amount);

    return 0;
}
