#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,k=0;
  int g[50];
  int a[50][50];
  cin>>r>>c;
  for (i=0;i<r;i++)
  {
    for (j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for (j=0;j<c;j++)
  {
    for (i=0;i<r-1;i++)
    {
      if (a[i][j]<a[i+1][j])
      {
        g[k]=a[i+1][j];
      }
      else
        g[k]=a[i][j];
    }
    k++;
    
  }
  for(i=0;i<k;i++)
      cout<<g[i]<<endl;
  
}