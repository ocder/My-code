import java.util.*;

public class NO62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[1000001];
        for(int i=0;i<nums.length;i++) {
            String str = String.valueOf(i);
            if(str.contains("4") || str.contains("62")) {
                nums[i] = 1;
            }
        }
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if(n==0 && m==0) {
                break;
            }
            int sum = m-n+1;
            for(int i=n;i<=m;i++) {
                if(nums[i]==1) {
                    sum--;
                }
            }
            System.out.println(sum);
        }
    }
}