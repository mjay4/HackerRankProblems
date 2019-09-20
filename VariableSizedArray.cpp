#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    long n,q;
    cin>>n>>q; 
    long value;
    vector<vector<int> > ar(n); 
    for(long i=0;i<n;i++){
        long size;
        cin>>size;
        for(long j=0; j<size; j++){
            cin >> value ;
            ar [ i ].push_back ( value ) ;
        }
    } 
    for(long i=0;i<q;i++){
        long j,k;
        cin>>j>>k;
        cout<<ar[j][k]<<"\n";
    }
    return 0;
}

