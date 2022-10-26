#include<stdio.h>
#include<stdlib.h>
#include <time.h>
#define MAX_SIZE 10

int arr[MAX_SIZE];
void Bubble_sort() {
    int temp;
    for(int i = MAX_SIZE-1; i >= 1; i--) {
        for(int j = 0; j <= i-1; j++) {
            if(arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    srand(time(NULL));
    int n = MAX_SIZE;
    for (int i = 0; i < n; i++) {
        arr[i] = rand() % 100;
    }

    Bubble_sort();
    for(int i = 0; i < n; i++) {
        printf("%d, ", arr[i]);
    }
    printf("\n");
    return 0;
}
