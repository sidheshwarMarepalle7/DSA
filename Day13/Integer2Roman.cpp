#include <iostream>
#include <string>
using namespace std;

class IntToRoman {
public:
    string intToRoman(int num) {
        // Roman numerals with values
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        string symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        string roman;
        for (int i = 0; i < 13; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman += symbols[i];
            }
        }
        return roman;
    }
};

int main() {
    int number;
    cout << "Enter an integer: ";
    cin >> number;

    IntToRoman obj;
    string roman = obj.intToRoman(number);

    cout << "Roman numeral: " << roman << endl;
    return 0;
}
