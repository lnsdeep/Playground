#include <iostream>
using namespace std;
long long int fact(long long int n){
  if(n<0){
    return 0;}
  if(n==0){
    return 1;}
  if(n==1){
    return 0;}
  return ((n-1)*(fact(n-1)+fact(n-2))) % 100000007;}
int main() 
{
   int n;
  cin>>n;
  cout<<fact(n);
    return 0;
}