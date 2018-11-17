#include <stdio.h>
#include <math.h>

double F(double x, double y) {
    return 6*pow(x, 7)+8*pow(x, 6)+7*pow(x, 3)+5*x*x-y*x;
}

//这里不是单纯的求导，下面主函数中进行了对导数等于0的二分求解
double f(double x) {
    return 42*pow(x, 6)+48*pow(x, 5)+21*pow(x, 2)+10*x;
}

int main() {
    int T;
    double left, mid, right, y;
    scanf("%d", &T);
    while(T--) {
        scanf("%lf", &y);
        left = 0;right = 100;
        while(right-left>10e-7) {
            mid = (left+right)/2;
            if(f(mid)<y) {
                left = mid;
            }
            else {
                right = mid;
            }
        }
        printf("%.4lf\n", F(mid, y));
    }
    return 0;
}
