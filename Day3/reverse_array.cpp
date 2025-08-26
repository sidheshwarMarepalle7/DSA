#include<iostream>
using namespace std;

// Print array in reverse order

int main()
{
int arr[6] = {1,2,3,4,5,6};
cout<<"Array: \n";
for(int i = 0; i < 6; i++)
{
    cout<<arr[i]<<" ";
}cout<<endl;

// Approach 1
cout<<"Expected reversed Array: ";
for(int i = 5; i >= 0; i--)
{
    cout<<arr[i]<<" ";
}

//Approach 2
int start=0, end=5;
while(start<=end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
cout<<"\nReversed array: ";
for(int i = 0; i < 6; i++)
    {
        cout<<arr[i]<<" ";
    }   
}