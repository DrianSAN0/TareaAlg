#include <iostream>
#include <math.h>
using namespace std;
 
int main() {
    double N, s;
    cin >> N;
    while(N-- && (cin >> s))
        cout << long((sqrt(1+8*s)-1)/2)<< endl;
    return 0;
}