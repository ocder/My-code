import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(sum(n));
    }
    
    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return n*sum(n-1);
    }
}