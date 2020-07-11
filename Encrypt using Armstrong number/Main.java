#include <iostream>
using namespace std;
int main()
{
int n,sum=0,temp,p,p1=0,k,cp=0;
cin>>n;
temp=n;
while (n>0)
{
    k=n%10;
    cp=cp+1;
    n=n/10;
}
n=temp;
while(n>0)
{

p = n%10;
if (cp==3)
    p1=p*p*p;
else if (cp==4)
    p1=p*p*p*p;
else if (cp==5)
    p1=p*p*p*p*p;
else if (cp==6)
    p1=p*p*p*p*p*p;
else if (cp==1)
    p1=p;
else if (cp==30)
    p1=p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p*p;

sum = sum + p1;
//cout<<sum<<"-";
n = n/10;
}
if(temp == sum)
{
cout<<"Kindly proceed with encrypting\n";
}
else
{
cout<<"It is not an Armstrong number\n";
}
return 0;
}
