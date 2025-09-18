// find minimum char to make string palinddrome

#include <iostream>
#include<string>
 using namespace std;

class getString{
public:
    string getPalindrome(string s){
        string str;
        for(int i = 0 ; i<s.length(); i++){
            if(s[i]!=s[s.length()-i-1]){
            str+=s[s.length()-i-1];
            }
        }
        return str+s;
    }
};

int main(){
    cout<<"Enter a string: "<<endl;
    string s;
    cin>>s;
    getString obj;
    string palindrome = obj.getPalindrome(s);
    int charsAdded = palindrome.length() - s.length();
    cout<<"Palindrome string: "<<palindrome<<" and "<<charsAdded<<" charecters added newly.";

}