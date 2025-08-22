//Print Numbers from 1 to N → O(n) Time, O(1)

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter N: ";
    cin >> n;

    for (int i = 1; i <= n; i++) {
        cout << i << " ";
    }

    return 0;
}
