//Store Multiplication Table of N → O(n) Space

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int table[10];  // stores multiplication results

    for (int i = 1; i <= 10; i++) {
        table[i - 1] = n * i;
    }

    cout << "Multiplication Table of " << n << ": ";
    for (int i = 0; i < 10; i++) {
        cout << table[i] << " ";
    }

    return 0;
}
