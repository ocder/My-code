#include <stdio.h>
#include <string.h>
#include <queue>
using namespace std;

int Line[1000001], N, K;

struct Loc {
    int x, step;
};

int check(int x) {
    if(x<0||x>1000000||Line[x]) {
        return 0;
    }
    return 1;
}

int BFS(int x) {
    Loc cur, next;
    queue<Loc> L;
    cur.x = x;
    cur.step = 0;
    Line[x] = 1;
    L.push(cur);
    while(!L.empty()) {
        cur = L.front();
        //如果没有下面这句就无法结束下面while中的循环
		L.pop();
        if(cur.x == K) {
            return cur.step;
        }
        next = cur;
        //第一种情况入栈
        next.x = cur.x+1;
        if(check(next.x)) {
            next.step = cur.step+1;
            Line[next.x] = 1;
            L.push(next);
        }
        //第二种情况入栈
        next.x = cur.x-1;
        if(check(next.x)) {
            next.step = cur.step+1;
        	Line[next.x] = 1;
            L.push(next);
        }
        //第三种情况入栈
        next.x = cur.x*2;
        if(check(next.x)) {
            next.step = cur.step+1;
            Line[next.x] = 1;
            L.push(next);
        }
    }
    return -1;
}

int main() {
    while(~scanf("%d%d", &N, &K)) {
        memset(Line, 0, sizeof(Line));
        printf("%d\n", BFS(N));
    }
    return 0;
}
