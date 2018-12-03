//http://acm.hdu.edu.cn/showproblem.php?pid=1248
#include <iostream>
using namespace std;

int main() {
    int T, N;
    cin>>T;
    while(T--) {
        cin>>N;
        int Money150;
        Money150 = N / 150;
        //先全部优先买150的物品
        N = N % 150;
        //相当于150的物品中有一部分可以买200的，买到钱不够为止
        if(N / 50 <= Money150) {
            N = N % 50;
        }
        //比如250这种情况，50的数目大于150的数目，就让所有的150变成200
        else {
            N = N - 50 * Money150;
        }
        cout << N << endl;
    }
    return 0;
}