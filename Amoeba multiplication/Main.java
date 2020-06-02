#include<iostream>
using namespace std;
int main(){
  
    int i, n, t1 = 0, t2 = 1, nextTerm;
    cin>>n;
  for (i = 1; i < n-1; ++i) {
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    //cout<<t2<<"\n";
    }
  cout<<t2;
}