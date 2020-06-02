# include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n,m,r,a;
  cin>>n>>m>>r;
  a=pow(n,m);
  //cout<<a;
  if(a>=r){
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}