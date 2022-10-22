#include<stdio.h>
#include<stdlib.h>
#include <time.h>

#define MAX_SIZE 10

int arr[MAX_SIZE];
void selection_sort(int arr[], int n) {
    int least, tmp;
    for(int i=0; i<n-1; i++) {
        least = i;
        for(int j = i+1; j<n; j++) {
            if(arr[j] < arr[least])
                least = j;
        }
        arr[i] = arr[least];
    }
}
int main() {
    srand(time(NULL)); // 씨드 변경 함수
    int n = MAX_SIZE;
    for (int i = 0; i < n; i++) {
        arr[i] = rand() % 100; // 랜덤값 반환 함수
        printf("%d, ", arr[i]);
    }
    printf("\n");
    selection_sort(arr, n);
    for(int i = 0; i<n; i++) {
        printf("%d, ", arr[i]);
    }
    printf("\n");
    return 0;
}
