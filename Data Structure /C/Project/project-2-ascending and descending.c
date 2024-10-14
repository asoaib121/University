#include <stdio.h>
#include <stdlib.h>
#define MAX_FLATS 100
int UID,size,year;
struct Flat
{
    int UID,size,year;
    char ZIP[10];
    char address[20];
    double price;
};

struct Flat database[MAX_FLATS];
int numFlats = 0;

void Sales() {
    if (numFlats >= MAX_FLATS) {
        printf("Database is full.\n");
        return;
    }
    printf("Enter UID: ");
    scanf("%d", &UID);

    printf("Enter Size: ");
    scanf("%d",&size);

    printf("Enter Year: ");
    scanf("%d",&year);

    for (int i = 0; i < numFlats; i++) {
        if (database[i].UID == UID) {
            printf("UID already exists.\n");
            return;
        }
    }
    database[numFlats].UID = UID;
    database[numFlats].size=size;
    database[numFlats].year=year;

    printf("Enter ZIP code: ");
    scanf("%s",database[numFlats].ZIP);

    printf("Enter Address: ");
    scanf("%s",database[numFlats].address);

    printf("Enter price: ");
    scanf("%lf", &database[numFlats].price);

    numFlats++;
    printf("New flat sale information added.\n");
    getchar();
}

void Erase(int UID) {
    for (int i = 0; i < numFlats; i++) {
        if (database[i].UID == UID) {
            for (int j = i; j < numFlats - 1; j++) {
                database[j] = database[j + 1];
            }
            numFlats--;
            printf("Entry deleted.\n");
            return;
        }
    }
    printf("Entry not found.\n");
}

void Search(int UID) {
    for (int i = 0; i < numFlats; i++) {
        if (database[i].UID == UID) {
            printf("Flat Information:\n");
            printf("UID: %d\n", database[i].UID);
            printf("ZIP: %s\n", database[i].ZIP);
            printf("Price: %.2lf\n", database[i].price);
            return;
        }
    }
    printf("Entry not found.\n");
}

void SortByPriceAsc() {
    struct Flat temp;
    for (int i =1 ; i < numFlats; i++) {
        for (int j = 0; j < numFlats-i; j++) {
            if (database[j].price > database[j+1].price) {
                temp = database[j];
                database[j] = database[j+1];
                database[j+1] = temp;
            }
        }
    }
    printf("Database record sorted by ascending price.\n");
}

void SortByPriceDesc() {
    for (int i =1; i < numFlats; i++) {
        for (int j =0; j < numFlats-i; j++) {
            if (database[j].price < database[j+1].price) {
                struct Flat temp = database[j];
                database[j] = database[j+1];
                database[j+1] = temp;
            }
        }
    }
    printf("Database record sorted by descending price.\n");
}

void SortRange(double startUID,double endUID){
    struct Flat temp;

   for (int i = 0; i < numFlats; i++) {
        for (int j = 0; j < numFlats - i; j++) {
            if (database[j].price > database[j + 1].price &&
                database[j].price >= startUID &&
                database[j + 1].price <= endUID) {
                temp = database[j];
                database[j] = database[j + 1];
                database[j + 1] = temp;
                }
            }
        }
}
void displayFlats() {
    if (numFlats == -1) {
        printf("Database is empty.\n");
    } else {
        printf("Flat Information:\n");
        for (int i = 0; i < numFlats; i++) {
            printf("UID: %d\t", database[i].UID);
            printf("SIZE: %d\t", database[i].size);
            printf("YEAR: %d\n\n", database[i].year);
            printf("ZIP: %s\t", database[i].ZIP);
            printf("ADDRESS: %s\t",database[i].address);
            printf("PRICE: %.2lf\n\n",database[i].price);
        }
    }
}
int main() {
    numFlats = 0;
    int choice;
    double startUID,endUID;

    while (1) {
        printf("Menu:\n");
        printf("1. Add a flat\n");
        printf("2. Delete a flat\n");
        printf("3. Search for a flat\n");
        printf("4. Sort flats by price ascending\n");
        printf("5. Sort flats by price descending\n");
        printf("6. Sort flats within a range\n");
        printf("7. Display all flats\n");
        printf("8. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
        case 1:
            Sales();
            break;
        case 2:
            printf("Enter UID to delete: ");
            scanf("%d", &UID);
            Erase(UID);
            break;
        case 3:
            printf("Enter UID to search: ");
            scanf("%d", &UID);
            Search(UID);
            break;
        case 4:
            SortByPriceAsc();
            displayFlats();
            break;
        case 5:
            SortByPriceDesc();
            displayFlats();
            break;
        case 6:
            printf("Enter start UID: ");
            scanf("%d", &startUID);
            printf("Enter end UID: ");
            scanf("%d", &endUID);
            printf("Your SortRange Database.\n");
            SortRange(startUID, endUID);
            break;
        case 7:
            displayFlats();
            break;
        case 8:
            printf("Exiting...\n");
            return 0;
        default:
            printf("Invalid choice. Please try again.\n");
            break;
        }
    }
    return 0;
}

