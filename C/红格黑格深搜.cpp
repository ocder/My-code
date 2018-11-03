#include <stdio.h>
#include <string.h>
char square[20][20];
int x, y, M, H;

int DFS(int x, int y){
    if(x<0 || x>H-1 || y<0 || y>M-1){
        return 0;
    }
    //不加分支语句会无限循环
    if(square[x][y]=='#'){
        return 0;
    }
    else{
        square[x][y] = '#';
        return 1+DFS(x-1, y)+DFS(x+1, y)+DFS(x, y-1)+DFS(x, y+1);
    }
}

int main(){
    while(scanf("%d%d", &M, &H)!=EOF){
        if(M==0&&H==0){
            break;
        }
        //把一行当作一个字符串输入
        for(int i=0;i<H;i++)
		{
			scanf("%s",square[i]);
		}
        for(int i=0;i<H;i++){
            for(int j=0;j<M;j++){
                if(square[i][j]=='@'){
                    x = i;
                    y = j;
                }
            }
        }
        printf("%d\n", DFS(x, y));
    }
    return 0;
}
