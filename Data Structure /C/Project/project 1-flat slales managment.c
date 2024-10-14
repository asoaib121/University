#include<stdio.h>

#define MAX_FLATS 100

void scrollCaption()
{
    printf("\n\n\n\n                    \t\t");

    printf("W");
    usleep(100000);
    printf("e");
    usleep(100000);
    printf("l");
    usleep(100000);
    printf("c");
    usleep(100000);
    printf("o");
    usleep(100000);
    printf("m");
    usleep(100000);
    printf("e");
    usleep(100000);
    printf(" ");
    usleep(100000);
    printf("T");
    usleep(100000);
    printf("o");
    usleep(100000);
    printf(" ");
    usleep(100000);
    printf("F");
    usleep(100000);
    printf("L");
    usleep(100000);
    printf("A");
    usleep(100000);
    printf("T");
    usleep(100000);
    printf(" ");
    usleep(100000);
    printf("S");
    usleep(100000);
    printf("A");
    usleep(100000);
    printf("L");
    usleep(100000);
    printf("E");
    usleep(100000);
    printf("S");
    usleep(100000);
    printf(" ");
    usleep(100000);
    printf("M");
    usleep(100000);
    printf("a");
    usleep(100000);
    printf("n");
    usleep(100000);
    printf("a");
    usleep(100000);
    printf("g");
    usleep(100000);
    printf("e");
    usleep(100000);
    printf("m");
    usleep(100000);
    printf("e");
    usleep(100000);
    printf("n");
    usleep(100000);
    printf("t");
    usleep(100000);
    printf(" ");
    usleep(100000);
    printf("S");
    usleep(100000);
    printf("y");
    usleep(100000);
    printf("s");
    usleep(100000);
    printf("t");
    usleep(100000);
    printf("e");
    usleep(100000);
    printf("m");

    printf("\n\n\n\n\t\t\t\tPress Enter  to continue.......\n");
    getch();
}

struct Flat
{
    int UID;
    char ZIP[10];
    double price;
};
struct Flat database[MAX_FLATS];
int numFlats=0;

void Sales()
{
    if (numFlats >= MAX_FLATS){
        printf("Database is full.\n");
        return;
    }
    printf("Enter UID: ");
    scanf("%d",&database[numFlats].UID);

    printf("Enter ZIP code: ");
    scanf("%s",database[numFlats].ZIP);

    printf("Enter price: ");
    scanf("%lf",&database[numFlats].price);

    numFlats++;
    printf("New flat sale information added.\n");
}
void Erase(int UID)
{
    for (int i=0; i<numFlats; i++) {
        if (database[i].UID==UID) {
            for(int j=i; j<numFlats-1; j++) {
                database[j]=database[j+1];
            }
            numFlats--;
            printf("Entry deleted.\n");
            return;
        }
    }
    printf("Entry not found.\n");
}

void Search(int UID)
{
   for (int i = 0; i < numFlats; i++)  {
        if (database[i].UID == UID)  {
            printf("Flat Information:\n");
            printf("UID: %d\n", database[i].UID);
            printf("ZIP: %s\n", database[i].ZIP);
            printf("Price: %.2lf\n", database[i].price);
            return;
        }
    }
    printf("Entry not found.\n");
}

void printDB()
{
    printf("Flat Database:\n");
    for (int i=0; i<numFlats; i++)  {
        printf("UID:%d,ZIP:%s,Price:%.2lf\n",database[i].UID, database[i].ZIP, database[i].price);
    }
}

int getZIP(int UID)
{
    for (int i=0; i<numFlats; i++) {
        if (database[i].UID==UID) {
            return database[i].ZIP;
        }
    }
    return -1;
}
double getPrice(int UID)
{
    for (int i=0; i<numFlats; i++) {
        if (database[i].UID==UID) {
            return database[i].price;
        }
    }
    return -1.0;
}
int SalesCount()
{
    return numFlats;
}

double AveragePrice()
{
    double total = 0.0;
    for (int i = 0; i < numFlats; i++) {
        total += database[i].price;
    }
    return total / numFlats;
}
int main()
{
    scrollCaption();
    int choice,UID;

    while (1)
    {
        printf("\nChoose a number:\n");
        printf("1. Add new sales flat\n");
        printf("2. Erase an entry\n");
        printf("3. Search an entry\n");
        printf("4. Print the database\n");
        printf("5. Get ZIP code\n");
        printf("6. Get price\n");
        printf("7. total sales count\n");
        printf("8. Compute average price\n");
        printf("9. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            Sales();
            break;
        case 2:
            printf("Enter UID to delete: ");
            scanf("%d",&UID);
            Erase(UID);
            break;
        case 3:
            printf("Enter UID to search: ");
            scanf("%d",&UID);
            Search(UID);
            break;
        case 4:
            printDB();
            break;
        case 5:
            printf("Enter UID to get ZIP: ");
            scanf("%d",&UID);
            int zip=getZIP(UID);
            if (zip != -1) {
                printf("ZIP code: %s\n",zip);
            } else {
                printf("Entry not found.\n");
            }
            break;
        case 6:
            printf("Enter UID to get price: ");
            scanf("%d", &UID);
            double price = getPrice(UID);
            if (price != -1.0) {
                printf("Price: %.2lf\n", price);
            } else {
                printf("Entry not found.\n");
            }
            break;
        case 7:
            printf("Total sales: %d\n",SalesCount());
            break;
        case 8:
            printf("Average price: %.2lf\n", AveragePrice());
            break;
        case 9:
            exit(0);
        default:
            printf("Invalid choice.\n");
        }
        printf("\n");
    }
   return 0;
}
