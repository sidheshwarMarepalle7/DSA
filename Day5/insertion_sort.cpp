#include <iostream>
using namespace std;

void insertionSort(int arr[], int n) {
    for(int i = 1; i < n; i++) {
        int key = arr[i];  // current element
        int j = i - 1;

        // Shift elements greater than key to one position ahead
        while(j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Insert key at correct position
        arr[j + 1] = key;
    }
}
void insertionSortBySwap(int arr[], int n) {
    for(int i = 1; i < n; i++) {
        int j = i;
        // Keep swapping backwards until the element is in the right position
        while(j > 0 && arr[j] < arr[j - 1]) {
            swap(arr[j], arr[j - 1]);
            j--;
        }
    }
}

int main() {
    int arr[] = {5, 3, 4, 1, 2};
    int n = sizeof(arr)/sizeof(arr[0]);
    //  By shifting
    insertionSort(arr, n);
    cout << "Sorted array: ";
    for(int i = 0; i < n; i++)
        cout << arr[i] << " ";
       
    //  By swapping
    insertionSortBySwap(arr, n);
    cout << "Sorted array: ";
    for(int i = 0; i < n; i++)
        cout << arr[i] << " ";
    return 0;
}
