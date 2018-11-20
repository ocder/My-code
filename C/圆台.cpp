#include <stdio.h>
#include <math.h>
#define PI acos(-1.0)

//圆台体积计算
double solve(double r, double R, double H, double h) {
    double real_r = h/H*(R-r)+r;
    return PI/3*(r*r+r*real_r+real_r*real_r)*h;
}

int main() {
    int T;
    double V, R, H, r, real_V, mid;
    scanf("%d", &T);
    while(T--) {
        scanf("%lf%lf%lf%lf", &r, &R, &H, &V);
        double left=0, right=100;
        //二分约束条件
        while(right-left>10e-8) {
            mid = (left+right)/2;
            real_V = solve(r, R, H, mid);
            if(fabs(real_V-V)<=10e-8) {
                break;
            }
            else if(real_V>V) {
                right = mid;
            }
            else {
                left = mid;
            }
        }
        printf("%.6lf\n", mid);
    }
    return 0;
}
