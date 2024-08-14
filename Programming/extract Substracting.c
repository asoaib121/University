#include <stdio.h>
#include <string.h>
void a(char *source, int start, int length, char *desti) { int sourceLength = strlen(source);
    if (start >= sourceLength || start < 0 || length < 0) {printf("Invalid start length\n");
        return;}
    int i;
    for (i = 0; i < length && (start + i) < sourceLength; i++) {
        desti[i] = source[start + i];}
    desti[i] = '\0';}
int main() {
    char source[100], desti[100];
    int start, length;

    printf("Enter a original string: ");
    fgets(source, sizeof(source), stdin);
    source[strcspn(source, "\n")] = '\0';

    printf("Enter a start position: ");
    scanf("%d", &start);

    printf("Enter the length of the substring: ");
    scanf("%d", &length);
    a(source, start, length, desti);

    printf("Extracted substring: '%s'\n", desti);

    return 0;
}

