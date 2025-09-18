#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<bool> count(256, false);  // ASCII characters
        int first = 0, second = 0, len = 0;

        while (second < s.size()) {
            if (!count[s[second]]) {
                count[s[second]] = true;
                len = max(len, second - first + 1);
                second++;
            } else {
                count[s[first]] = false;
                first++;
            }
        }
        return len;
    }
};

int main() {
    string input;
    cout << "Enter a string: ";
    getline(cin, input);

    Solution sol;
    int result = sol.lengthOfLongestSubstring(input);

    cout << "Length of longest substring without repeating characters: " 
         << result << endl;

    return 0;
}
