//http://acm.hdu.edu.cn/showproblem.php?pid=2036
#include <stdio.h>
#include <iostream>

struct Point {
	int x, y;
}point[101];

int main() {
	int n;
	while (scanf_s("%d", &n), n) {
		double ans = 0;
		for (int i = 0; i < n; i++) {
			scanf_s("%d%d", &point[i].x, &point[i].y);
		}
        //利用叉乘计算平行四边形面积，最后一个点要分开讨论
		for (int i = 0; i < n-1; i++) {
			ans += point[i].x*point[i + 1].y - point[i + 1].x*point[i].y;
		}
        //还有最后一个点和第一个点，很容易漏，最后面积要除以二，因为要求的是三角形面积之和不是平行四边形
		ans+= point[n-1].x*point[0].y - point[0].x*point[n-1].y;
		printf_s("%.1lf\n", ans/2);
	}
	return 0;
}