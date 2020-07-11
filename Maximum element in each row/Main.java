#include<iostream>
using namespace std;
int main()
{
  int r,c,max;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    max=a[i][0];
    for(int j=0;j<c;j++)
    {
      if(a[i][j]>max)
      {
        max=a[i][j];
      }
    }
    cout<<max<<"\n";
  }
  
}