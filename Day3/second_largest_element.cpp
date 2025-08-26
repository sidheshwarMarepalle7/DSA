#include <iostream>
using namespace std;


// Find the second largest element in Array
class solution {
public:
    int print2element(int arr[], int n) {
        int largest = -1, second_largest = -1;

        // Find largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        // Find second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) { // skip the largest itself
                second_largest = max(second_largest, arr[i]);
            }
        }

        return second_largest;
    }
};

int main() {
    int arr[6] = {1, 2, 3, 4, 5, 6};
    cout << "Array: \n";
    for (int i = 0; i < 6; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    solution a;
    int result = a.print2element(arr, 6);
    cout << "Second Largest Element: " << result << endl;

    return 0;
}
