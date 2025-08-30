#include <iostream>
using namespace std;

int main() {
    int rows, cols;
    cout << "Enter rows and columns: ";
    cin >> rows >> cols;

    int arr[rows][cols], sum = 0;

    cout << "Enter elements: \n";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> arr[i][j];
            sum += arr[i][j];
        }
    }

    cout << "Sum of all elements = " << sum << endl;
    return 0;
}
