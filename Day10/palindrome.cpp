/*
Problem Statement:
Check if a given string is a palindrome. 
Input: A single word string.
Output: "Yes, it is Palindrome." if the string reads the same backward, else "Not a Palindrome!!!"
*/

#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;  // input single-word string

    int start = 0, end = s.size() - 1;
    while(start < end) {
        if(s[start] != s[end]) {
            cout << "Not a Palindrome!!!" << endl;
            return 0;
        }
        start++, end--;
    }
    cout << "Yes, it is Palindrome." << endl;
    return 0;
}
