//http://acm.hdu.edu.cn/showproblem.php?pid=4508
#include <stdio.h>
#include <iostream>
#include <string.h>
using namespace std;
int happy[100], energy[100], all[100000];

int max(int a, int b) {
	return a > b ? a : b;
}

int main()
{
	int n, m;
	while (scanf_s("%d", &n)!=EOF)
	{
		for (int i = 0; i < n; i++) {
			cin >> happy[i] >> energy[i];
		}
		cin >> m;
		memset(all, 0, sizeof(all));
		for (int i = 0; i < n; i++) {
			for (int j = energy[i]; j <= m; j++) {
				//这里的j相当于背包容量，容量最多到m
				//all[j - energy[i]] + happy[i]放入了energy[i]，幸福值增加happy[i]，剩余的空间为all[j - energy[i]]
				//all[j]相当于不放入energy[i]
				all[j] = max(all[j], all[j - energy[i]] + happy[i]);
			}
		}
		cout << all[m] << endl;
	}
	return 0;
}