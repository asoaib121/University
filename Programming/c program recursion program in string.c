#include <stdio.h>
int pow(int base, int expo)
{
    if(expo == 0)
        return 1;
    else if(expo > 0)
        return base * pow(base, expo - 1);
    else
        return 1 / pow(base, -expo);
}
int main()
{
    int base, power;
    int expo;

    printf("Enter base: ");
    scanf("%d", &base);
    printf("Enter exponent: ");
    scanf("%d", &expo);

    power = pow(base, expo);

    printf("%d ^ %d = %d", base, expo, power);

    return 0;
}
