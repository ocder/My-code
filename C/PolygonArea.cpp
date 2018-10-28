#include<stdio.h>

struct Point {
    int x, y;
}point[101];

int main() {
    int n;
    while(scanf("%d", &n)!=EOF) {
    	double sum=0;
        if(n==0) {
            break;
        }
        for(int i=0;i<n;i++) {
            scanf("%d%d", &point[i].x, &point[i].y);
        }
        point[n].x=point[0].x;
        point[n].y=point[0].y;
        //这里不能加等号 
        for(int i=0;i<n;i++) {
            sum+=(point[i].x*point[i+1].y-point[i+1].x*point[i].y);
        }
        printf("%.1lf\n", sum/2);
    }
    return 0;
}
