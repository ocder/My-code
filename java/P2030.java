import java.util.Scanner;

/*
    如果不是ASCII码可以表示的就是汉字
*/

public class P2030 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while(n!=0) {
			String str = in.nextLine();
			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				if((int)str.charAt(i)<0 || (int)str.charAt(i)>127) {
					sum++;
				}
			}
			System.out.println(sum);
			n--;
		}
	}
}
