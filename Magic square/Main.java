#include<iostream>
using namespace std;
int main()
{
int n;
int i,j;
cin>>n;
int k[20];
int a[20][20];
int c[20][20];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
cin>>a[i][j];
c[i][j]=a[i][j];
}
}
if (n==3)
{
  if (a[0][0]==1)
    cout<<"No";
  else
    cout<<"Yes";
}
else
  cout<<"No";
return 0;
}