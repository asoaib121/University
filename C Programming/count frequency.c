#include <stdio.h>
int main()
{   int arr[10], fr[10],i,j,n,count;

    printf("Enter the number of array: ");
    scanf("%d",&n);

    printf("Enter %d elements in the array:\n",n);
    for (i = 0; i < n; i++)
    {scanf("%d", &arr[i]);}

    for (i = 0; i < n; i++)
    { fr[i] = 0; }
    for (i = 0; i < n; i++)
    {
        count = 1;
        for (j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                count++;
                fr[j] = 0;
            }
        }
        if (fr[i] == 0)
        {
            fr[i] = count;
        }
    }
    printf("\nFrequency of all elements of the array:\n");
    for (i = 0; i < n; i++)
    { if (fr[i] != 0)
        {
            printf("%d occurs %d times\n", arr[i], fr[i]);}}

    return 0;
}
