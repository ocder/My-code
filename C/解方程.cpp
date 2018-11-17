#include <iostream>
#include <math.h>

double ans(double X) {
    return 8*pow(X, 4)+7*pow(X, 3)+2*pow(X, 2)+3*X+6;
}

double solve(double Y, double left, double right) {
    double mid = (left+right)/2;
    //如果没有终止条件递归将无法退出
    if((right-left)>10e-7) {
    	if(ans(mid)==Y) {
        return mid;
    	}
    	if(ans(mid)<Y) {
        	return solve(Y, mid, right);
    	}
    	if(ans(mid)>Y) {
        	return solve(Y, left, mid);
    	}
	}
    return mid;
}

int main() {
    int T;
    double Y, answer;
    scanf("%d", &T);
    while(T--) {
        scanf("%lf", &Y);
        if(Y<ans(0)||Y>ans(100)) {
            printf("No solution!\n");
        }
        else {
            printf("%.4lf\n", solve(Y, 0, 100));
        }
    }
    return 0;
}
