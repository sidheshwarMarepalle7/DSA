/*
Problem Statement:
Given two strings a and b, return the minimum number of times 
you should repeat string a so that string b is a substring of it. 
If it is impossible, return -1.

Example:
a = "abcd", b = "cdabcdab"
Output: 3  (since "abcdabcdabcd" contains "cdabcdab")
*/

#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int repeatedStringMatch(string a, string b) {
        string repeated = a;
        int count = 1;

        // Keep repeating until length >= b
        while (repeated.size() < b.size()) {
            repeated += a;
            count++;
        }

        // Check if b is now a substring
        if (repeated.find(b) != string::npos) return count;

        // Check one more repeat (sometimes needed for overlap)
        repeated += a;
        if (repeated.find(b) != string::npos) return count + 1;

        return -1;
    }
};

int main() {
    string a, b;
    cout << "Enter string a: ";
    cin >> a;
    cout << "Enter string b: ";
    cin >> b;

    Solution sol;
    int result = sol.repeatedStringMatch(a, b);

    cout << "Minimum repetitions required: " << result << endl;
    return 0;
}
