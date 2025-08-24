#include <iostream>
using namespace std;

int main() {
    int n, target;
    cout << "Enter size of array: ";
    cin >> n;

    int arr[1000];
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Enter number to count frequency: ";
    cin >> target;

    int minVal = arr[0], maxVal = arr[0], freq = 0;

    for (int i = 0; i < n; i++) {
        // Count frequency
        if (arr[i] == target) {
            freq++;
        }
        // Update min and max
        if (arr[i] < minVal) minVal = arr[i];
        if (arr[i] > maxVal) maxVal = arr[i];
    }

    cout << "Frequency of " << target << " = " << freq << endl;
    cout << "Minimum element = " << minVal << endl;
    cout << "Maximum element = " << maxVal << endl;

    return 0;
}
