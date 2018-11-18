#include <stdio.h>

//如果次数为奇数乘两次再右移一位，偶数乘一次右移一位
int Qpow(int a, int b) {
    int ans = 1;
    while(b!=0) {
        if(b&1!=0) {
            ans*=a;
        }
        a*=a;
        b>>=1;
        //printf("%d\n", b);
    }
    return ans;
}

int main() {
    int a, b;
    scanf("%d%d", &a, &b);
    //Qpow(a, b);
    printf("%d\n", Qpow(a, b));
    return 0;
}
