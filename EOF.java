/*
    *出现中文时为了避免报错可以使用javac -d . -encoding utf-8 文件地址
*/
import java.util.*;

public class EOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long [] nums = new long[39];
        nums[0] = 3;
        nums[1] = 8;
        for(int i=2;i<nums.length;i++) {
            //最后一位如果是E或F，有2*(n-1)种可能，最后一位是O，前一位只能是E或F，就有2*(n-2)种可能
            nums[i] = 2*(nums[i-1]+nums[i-2]);
        }
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(nums[n-1]);
        }
    }
}