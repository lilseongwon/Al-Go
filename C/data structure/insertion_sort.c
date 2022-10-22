#include<stdio.h>
#include<stdlib.h>
#include <time.h>

#define MAX_SIZE 10

int arr[MAX_SIZE];
void insertion_sort() {
    int key, i, j;
    for (i = 1; i < MAX_SIZE; i++) { 
        key = arr[i];
        for (j = i - 1; j >= 0 && arr[j] > key; j--) 
            arr[j + 1] = arr[j];
        arr[j + 1] = key;
    }
}
int main() {
    srand(time(NULL));
    int n = MAX_SIZE;
    for (int i = 0; i < n; i++) {
        arr[i] = rand() % 100; 
        printf("%d, ", arr[i]);
    }
    printf("\n");
    insertion_sort();
    for(int i = 0; i<n; i++) {
        printf("%d, ", arr[i]);
    }
    printf("\n");
    return 0;
}
