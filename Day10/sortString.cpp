/*
Problem Statement:
Sort the letters of a string in alphabetical order, ignoring non-alphabet characters. 
The output should be a string containing only sorted lowercase letters.
*/

#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
    string sortString(string str) {
        vector<int> freq(26, 0);
        string temp, ans;

        // Normalize and count frequency
        for(char ch : str) {
            if(isalpha(ch)) {
                ch = tolower(ch);
                freq[ch - 'a']++;
            }
        }

        // Build sorted string
        for(int i = 0; i < 26; i++) {
            while(freq[i] > 0) {
                ans += ('a' + i);
                freq[i]--;
            }
        }
        return ans;
    }
};

int main() {
    string str;
    cout << "Enter string: ";
    getline(cin, str);

    Solution sol;
    string res = sol.sortString(str);
    cout << "Sorted string: " << res << endl;

    return 0;
}
