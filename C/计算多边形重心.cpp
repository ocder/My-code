//http://acm.hdu.edu.cn/showproblem.php?pid=1115
//相当于起始点固定，另外两个点不停向后遍历，将N边形拆分成了N-2个三角形，利用三角形重心公式富裕面积作为权值
#include <iostream>
#include <cstdio>
using namespace std;
int T, N, x[3], y[3];
double sumx, sumy, sumarea;
int main()  {
    scanf("%d", &T);
    while(T--){
        sumx = sumy = sumarea = 0.0;
        scanf("%d", &N);
        scanf("%d %d %d %d", x, y, x+1, y+1);
        N -= 2;
        while(N--){
            scanf("%d %d", x+2, y+2);
            //求新添加的三角形的面积
            double s = ((x[1] - x[0]) * (y[2] - y[0]) - (x[2] - x[0]) * (y[1] - y[0])) / 2.0;
            //求∑x[i]*s[i]和∑y[i]*s[i]
            sumx += ((x[0] + x[1] + x[2]) * s);
            sumy += ((y[0] + y[1] + y[2]) * s);
            //求总面积
            sumarea += s;
 
            x[1] = x[2];
            y[1] = y[2];
        }
        printf("%.2lf %.2lf\n", sumx / sumarea / 3, sumy / sumarea / 3);
    }
    return 0;
}
