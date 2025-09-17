/*
Problem Statement:
Given an integer N, find its factorial. 
Since factorial values can be very large, store and return the result as a vector of digits.
*/

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<int> factorial(int N) {
        vector<int> ans(1, 1);
        while (N > 1) {
            int carry = 0, res, size = ans.size();
            for (int i = 0; i < size; i++) {
                res = ans[i] * N + carry;
                ans[i] = res % 10;
                carry = res / 10;
            }
            while (carry) {
                ans.push_back(carry % 10);
                carry /= 10;
            }
            N--;
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

int main() {
    int N;
    cout << "Enter a number: ";
    cin >> N;

    Solution sol;
    vector<int> result = sol.factorial(N);

    cout << "Factorial of " << N << " is: ";
    for (int digit : result) {
        cout << digit;
    }
    cout << endl;

    return 0;
}
