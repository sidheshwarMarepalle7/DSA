/*
Problem Statement:
You are given a string s. 
Sort all the vowels in the string in non-decreasing order while keeping the consonants 
in their original positions. Return the resulting string.

Example:
Input: s = "lEetcOde"
Output: "lEOtcede"

Explanation:
- Extract vowels: ['E', 'e', 'O', 'e']
- Sort vowels: ['E', 'O', 'e', 'e']
- Place them back: "lEOtcede"
*/

#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
    string sortVowels(string s) {
        vector<int> low(26, 0); // For lowercase vowels
        vector<int> up(26, 0);  // For uppercase vowels
        vector<int> vowelPositions;

        // Step 1: Identify vowels and mark positions
        for (int i = 0; i < s.size(); i++) {
            char c = s[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                low[c - 'a']++;
                s[i] = '#';  // mark to replace later
                vowelPositions.push_back(i);
            } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                up[c - 'A']++;
                s[i] = '#';  // mark to replace later
                vowelPositions.push_back(i);
            }
        }

        // Step 2: Build sorted vowel string (uppercase first)
        string sortedVowels;
        for (int i = 0; i < 26; i++) {
            char upper = 'A' + i;
            while (up[i]--) sortedVowels += upper;
        }
        for (int i = 0; i < 26; i++) {
            char lower = 'a' + i;
            while (low[i]--) sortedVowels += lower;
        }

        // Step 3: Replace '#' with sorted vowels
        for (int i = 0; i < vowelPositions.size(); i++) {
            s[vowelPositions[i]] = sortedVowels[i];
        }

        return s;
    }
};

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);
    Solution sol;
    string result = sol.sortVowels(str);
    cout << "Sorted vowels in string: " << result << endl;
    return 0;
}
