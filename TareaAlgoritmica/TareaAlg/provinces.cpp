#include <iostream>
using namespace std;

int main() {
    int gold, silver, copper;
    cin >> gold >> silver >> copper;
    int total = gold * 3 + silver * 2 + copper;
    if (total > 1) {
        if (total > 7) {
            cout << "Province";
        } else if (total > 4) {
            cout << "Duchy";
        } else if (total > 1) {
            cout << "Estate";
        }
        cout << " or ";
    }
    if (total > 5) {
        cout << "Gold";
    } else if (total > 2) {
        cout << "Silver";
    } else {
        cout << "Copper";
    }
    return 0;
}