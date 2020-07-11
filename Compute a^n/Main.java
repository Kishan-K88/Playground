#include <iostream>
int FindPower(int base, int power);
using namespace std;
int main() {
   int base,power;
   cin>>base>>power;
   cout<<"Enter the value of a"<<"\n"<<"Enter the value of n"<<"\n";
   cout<<"The value of "<<base << " power "<<power <<" is "<<FindPower(base, power);
   return 0;
}
int FindPower(int base, int power) {
   if (power == 0)
   return 1;
   else
   return (base * FindPower(base, power-1));
}