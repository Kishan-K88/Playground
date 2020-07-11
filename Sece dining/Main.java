#include<iostream>
using namespace std;
int main()
{
  string fre;
  int rail;
  cin>>fre>>rail;
  if(fre=="front")
  {
    if(rail==1)
    {
      cout<<"Left Handed\n";
    }
    else
    {
      cout<<"Right Handed\n";
    }
  }
  else if(fre=="rear")
  {
    if(rail==1)
    {
      cout<<"Right Handed\n";
    }
    else
    {
      cout<<"Left Handed\n";
    }
  }
    return 0;
}