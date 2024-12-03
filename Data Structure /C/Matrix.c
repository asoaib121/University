// Matrix for graph
#include <stdio.h>

int charToIndex(char C){
    return (C-'A');
}

int main()
{
    int n,v;
    printf("Enter the number of nodes: ");
    scanf("%d",&n);
    printf("Enter the number of Vertices: ");
    scanf("%d",&v);

    int adj[n][n], i, j, r, c;
    char row, column;

    for(i=0;i<n;i++){
        for(j=0; j<n;j++){
            adj[i][j] = 0;
            printf("%d\t", adj[i][j]);
        }
        printf("\n");
    }

    for(i=0; i<v; i++){
        printf("Enter the name of %dth Edge: ",i+1);
        scanf(" %c",&row);
        scanf(" %c",&column);

        r = charToIndex(row);
        c = charToIndex(column);

        if (r >= n || c >= n) {
            printf("Invalid vertex name.\n");
            return 1;
        }

        adj[r][c] = 1;
        adj[c][r] = 1;
    }


    for(i=0;i<n;i++){
        for(j=0; j<n;j++){
            printf("%d\t", adj[i][j]);
        }
        printf("\n");
    }

    return 0;
}
