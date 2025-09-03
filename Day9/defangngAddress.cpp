// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".

#include<iostream>
#include<string>

using namespace std;


    string defangIPaddr(string address) {
        string ans;
        int index =0;
        while(index<address.length()){
            if(address[index]=='.') ans = ans+"[.]";
            else ans = ans + address[index];
            index++;
        }
        return ans;
    }

int main(){
    string address;
    cout<<"Enter IP address: "<<endl;
    getline(cin,address);
    string res = defangIPaddr(address);
    cout<<res;
}