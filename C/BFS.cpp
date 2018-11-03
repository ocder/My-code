#include<stdio.h>
#include<queue>
#include<string.h>
using namespace std;

int N, A, B;
int LevelStep[202], vis[202];

struct node{
    int level, step;
};

int check(int x){
    if(x<=0 || x>N){
        return 1;
    }
    return 0;
}

//不停地对队列第一个元素进行操作
int BFS(){
    queue<node> Q;
    node a, next;
    a.level = A;
    a.step = 0;
    vis[A] = 1;
    Q.push(a);
    while(!Q.empty()){
        a = Q.front();
        Q.pop();
        if(a.level == B){
            return a.step;
        }
        for(int i=-1;i<=1;i+=2){
            next = a;
            next.level += i*LevelStep[next.level];
            if(check(next.level) || vis[next.level]){
                continue;
            }
            vis[next.level] = 1;
            next.step++;
            Q.push(next);
        }
    }
    return -1;
}

int main(){
    while(~scanf("%d", &N), N){
        scanf("%d%d", &A, &B);
        for(int i=1;i<=N;i++){
            scanf("%d", &LevelStep[i]);
        }
        memset(vis, 0, sizeof(vis));
        printf("%d\n", BFS());
    }
    return 0;
}