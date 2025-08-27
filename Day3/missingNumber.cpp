#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n (range will be 1 to n): ";
    cin >> n;

    int arr[n - 1];
    cout << "Enter " << n - 1 << " elements (1 to n with one missing): ";
    for (int i = 0; i < n - 1; i++) {
        cin >> arr[i];
    }

    // Expected sum of 1 to n
    int totalSum = (n * (n + 1)) / 2;

    // Actual sum of given array
    int arraySum = 0;
    for (int i = 0; i < n - 1; i++) {
        arraySum += arr[i];
    }

    cout << "Missing element is: " << totalSum - arraySum << endl;

    return 0;
}
