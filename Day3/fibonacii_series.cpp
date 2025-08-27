#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of terms for Fibonacci series: ";
    cin >> n;

    int fib[100];
    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }

    cout << "Fibonacci series: ";
    for (int i = 0; i < n; i++) {
        cout << fib[i] << " ";
    }
    cout << endl;

    return 0;
}
