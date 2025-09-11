/*
Problem Statement:
Add two non-negative numbers given as strings and return the sum as a string.
This handles very large numbers that cannot be stored in int/long.
*/

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
    string addStrings(string num1, string num2) {
        int a = num1.size() - 1, b = num2.size() - 1;
        string ans;
        int carry = 0;

        while (a >= 0 || b >= 0 || carry) {
            int digit1 = a >= 0 ? num1[a--] - '0' : 0;
            int digit2 = b >= 0 ? num2[b--] - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            ans += (sum % 10) + '0';
        }

        reverse(ans.begin(), ans.end());
        return ans;
    }
};

int main() {
    string num1, num2;
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;

    Solution sol;
    string result = sol.addStrings(num1, num2);

    cout << "Sum = " << result << endl;
    return 0;
}
