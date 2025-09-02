#include <iostream>
using namespace std;

// Function to search an element in a sorted 2D array
bool binarySearch2D(int arr[][100], int rows, int cols, int target) {
    int low = 0, high = rows * cols - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        // Map 1D index to 2D
        int r = mid / cols;
        int c = mid % cols;

        if (arr[r][c] == target) {
            cout << "Element found at position (" << r << ", " << c << ")" << endl;
            return true;
        }
        else if (arr[r][c] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    cout << "Element not found." << endl;
    return false;
}

int main() {
    int rows, cols, target;
    cout << "Enter rows and columns: ";
    cin >> rows >> cols;

    int arr[100][100];
    cout << "Enter elements (sorted in row-major order):\n";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> arr[i][j];
        }
    }

    cout << "Enter element to search: ";
    cin >> target;

    binarySearch2D(arr, rows, cols, target);

    return 0;
}
