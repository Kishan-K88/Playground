#include<iostream>

#include<math.h>

int main()

{

int a,b,c;
std::cin>>a;
std::cin>>b;
std::cin>>c;
int m=pow(a,b);
if(m>=c)
{
std::cout<<"Doctor, you can proceed with your experiment.";
}
else
{
std::cout<<"Sorry Doctor! You need more bacteria.";
}
}
