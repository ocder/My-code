import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args){
		int [] a=new int[100010];
		int n;
		a[1]=1;
		a[2]=1;
		for(int i=3;i<10000;i++){
			a[i]=a[i-1]+a[i-2];
		}
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		System.out.println("ֵ="+a[n]);
		}
	}

		

