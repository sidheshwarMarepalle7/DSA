#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int num(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    int romanToInt(string s) {
        int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            if (i + 1 < s.size() && num(s[i]) < num(s[i + 1])) {
                sum -= num(s[i]);
            } else {
                sum += num(s[i]);
            }
        }
        return sum;
    }
};

int main() {
    string roman;
    cout << "Enter Roman numeral: ";
    cin >> roman;

    Solution sol;
    int result = sol.romanToInt(roman);

    cout << "Integer value: " << result << endl;
    return 0;
}
