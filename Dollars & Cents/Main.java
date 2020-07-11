#include<iostream>
using namespace std;
int main()
{
    int a,b,c,d,e,f,t;
    std::cin>>a>>b>>c>>d;
    e=a+c;
    f=b+d;
  	t=f;
    while(t>=100)
    {
        t=t/100;
        e=e+t;
      	f=f%100;
    }
    cout<<e<<endl<<f;
    
    return 0;
}