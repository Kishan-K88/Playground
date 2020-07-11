#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++) cin>>arr[i][j];
  }

  int arrr[r], arrc[c];
  int sum = 0;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      sum = sum + arr[i][j];
    }
    arrr[i] = sum;
    sum = 0;
  }

  
  sum = 0;
  for(int j=0;j<c;j++){
    for(int i=0;i<r;i++){
      sum = sum + arr[i][j];
    }
    arrc[j] = sum;
    sum = 0;
  }
  
  int arrrtemp[r], arrctemp[c];
  for(int i=0;i<r;i++) arrrtemp[i] = arrr[i];
  for(int i=0;i<c;i++) arrctemp[i] = arrc[i];

  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)cout<<arrr[i]<<" ";
  cout<<endl;

  int temp;
  for(int i=0;i<r;i++){
    for(int j=i+1;j<r;j++){
      if(arrr[i] < arrr[j]){
        temp = arrr[j];
        arrr[j] = arrr[i];
        arrr[i] = temp;
      }
    }
  }

  int R;
  for(R=0;R<r;R++){
    if(arrr[0] == arrrtemp[R])break;
  }
  cout<<"Row "<<R+1<<" has maximum sum"<<endl;

  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++)cout<<arrc[i]<<" ";
  cout<<endl;

  for(int i=0;i<c;i++){
    for(int j=i+1;j<c;j++){
      if(arrc[i] < arrc[j]){
        temp = arrc[j];
        arrc[j] = arrc[i];
        arrc[i] = temp;
      }
    }
  }

  int C;
  for(C=0;C<c;C++){
    if(arrc[0] == arrctemp[C])break;
  }
  cout<<"Column "<<C+1<<" has maximum sum"<<endl;

}