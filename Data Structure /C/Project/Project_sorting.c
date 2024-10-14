#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SALES 100

struct PropertySale {
    int UID;
    char address[100];
    int ZIP;
    int size;
    int constructionYear;
    double price;
};

struct PropertySale SalesDatabase[MAX_SALES];
int numSales = 0;

// Function to insert a new property sale
void Sales(int UID, const char *address, int ZIP, int size, int constructionYear, double price) {
    if (numSales >= MAX_SALES) {
        printf("Database is full.\n");
        return;
    }

    SalesDatabase[numSales].UID = UID;
    strcpy(SalesDatabase[numSales].address, address);
    SalesDatabase[numSales].ZIP = ZIP;
    SalesDatabase[numSales].size = size;
    SalesDatabase[numSales].constructionYear = constructionYear;
    SalesDatabase[numSales].price = price;
    numSales++;
}

// Function to delete an entry based on UID
void Erase(int UID) {
    int i;
    for (i = 0; i < numSales; i++) {
        if (SalesDatabase[i].UID == UID) {
            // Shift elements after the deleted entry
            for (int j = i; j < numSales - 1; j++) {
                SalesDatabase[j] = SalesDatabase[j + 1];
            }
            numSales--;
            printf("Entry with UID %d deleted.\n", UID);
            return;
        }
    }
    printf("Entry with UID %d not found.\n", UID);
}

// Function to find an entry based on UID
int Search(int UID) {
    int i;
    for (i = 0; i < numSales; i++) {
        if (SalesDatabase[i].UID == UID) {
            return i;
        }
    }
    return -1;
}

// Function to print all elements in the database
void PrintDB() {
    int i;
    printf("UID\tAddress\tZIP\tSize\tYear\tPrice\n");
    for (i = 0; i < numSales; i++) {
        printf("%d\t%s\t%d\t%d\t%d\t%.2f\n",
               SalesDatabase[i].UID,
               SalesDatabase[i].address,
               SalesDatabase[i].ZIP,
               SalesDatabase[i].size,
               SalesDatabase[i].constructionYear,
               SalesDatabase[i].price);
    }
}

// Function to get ZIP code
int GetZIP(int UID) {
    int index = Search(UID);
    if (index != -1) {
        return SalesDatabase[index].ZIP;
    }
    return -1;
}

// Function to get price
double GetPrice(int UID) {
    int index = Search(UID);
    if (index != -1) {
        return SalesDatabase[index].price;
    }
    return -1;
}

// Function to count total sales
int SalesCount() {
    return numSales;
}

// Function to compute average price
double AveragePrice() {
    int i;
    double total = 0;
    for (i = 0; i < numSales; i++) {
        total += SalesDatabase[i].price;
    }
    return total / numSales;
}

// Function to sort properties by price in ascending order
void SortByPriceAsc() {
    int i, j;
    struct PropertySale temp;
    for (i = 0; i < numSales - 1; i++) {
        for (j = i + 1; j < numSales; j++) {
            if (SalesDatabase[i].price > SalesDatabase[j].price) {
                temp = SalesDatabase[i];
                SalesDatabase[i] = SalesDatabase[j];
                SalesDatabase[j] = temp;
            }
        }
    }
}

// Function to sort properties by price in descending order
void SortByPriceDesc() {
    int i, j;
    struct PropertySale temp;
    for (i = 0; i < numSales - 1; i++) {
        for (j = i + 1; j < numSales; j++) {
            if (SalesDatabase[i].price < SalesDatabase[j].price) {
                temp = SalesDatabase[i];
                SalesDatabase[i] = SalesDatabase[j];
                SalesDatabase[j] = temp;
            }
        }
    }
}

// Function to sort properties within a specific range (not implemented yet)
void SortRange() {
    printf("SortRange function not implemented yet.\n");
}

int main() {
    // Example usage
    Sales(1, "123 Main St", 12345, 1000, 2023, 300000);
    Sales(2, "456 Elm St", 56789, 1500, 2022, 350000);
    Sales(3, "789 Oak St", 98765, 2000, 2021, 400000);

    SortByPriceAsc();
    PrintDB();

    return 0;
}
