/*
Problem Statement:
Sorting words of sentence in alphabetical order.
*/

#include<iostream>
#include<string>
#include<vector>
using namespace std;

class Solution {
public:
    string sortSentence(string s) {
        vector<string> ans(10); // Index 1 to 9 will be used 10th for null value
        string temp;
        int index = 0;

        while (index < s.size()) {
            if (s[index] == ' ') {
                int pos = temp[temp.size() - 1] - '0';
                temp.pop_back();
                ans[pos] = temp;
                temp.clear();
            } else {
                temp += s[index];
            }
            index++;
        }

        // Handle the last word
        if (!temp.empty()) {
            int pos = temp[temp.size() - 1] - '0';
            temp.pop_back();
            ans[pos] = temp;
        }

        // Build the result
        string ret;
        for (int i = 1; i <= 9; i++) {
            if (!ans[i].empty()) {
                ret += ans[i] + " ";
            }
        }

        // Remove trailing space
        if (!ret.empty()) ret.pop_back();

        return ret;
    }
};

int main() {
    string str;
    cout << "Enter a sentence: " << endl;
    getline(cin, str);
    Solution sol;
    cout << "Sorted string: " << sol.sortSentence(str) << endl;
}
