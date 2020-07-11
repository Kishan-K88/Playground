#include<iostream>
#include<bits/stdc++.h>
using namespace std;
#include<string>
int main() 
{
  string name;
  getline(cin,name);
  for(string::reverse_iterator i=name.rbegin(); i<name.rend(); i++)
  {
    cout<<*i;
  }
    
}