#include <iostream>
#include <string>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main()
{
  struct student k;
  cout<<"\nStudent Details\n";
  cin.getline(k.name,50);
  cin>>k.roll;
  cin>>k.marks;
  cout<<"Name: "<<k.name<<endl<<"Roll: "<<k.roll<<endl<<"Marks: "<<k.marks<<endl;


}
