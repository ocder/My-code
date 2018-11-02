 import java.util.*;
 
 public class GCDLCM {
     public static void main(String[] args) {
         int x, y;
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
         y = scanner.nextInt();
         System.out.println(getMaxDivide_ab(x, y));
         System.out.println(x * y / getMaxDivide_ab(x, y));
     }
     public static int getMaxDivide_ab(int a,int b){
        int value=1;
        int max;
        int min;
        if(a==b){
            return a;
        }
        if(a>b){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }
        for(int i=2;i<min;i++){
            if(0==max%i && 0==min%i){
                value=i;
                }
        }
        return value;
    }
 }
 