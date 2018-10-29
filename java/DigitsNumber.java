import java.util.*;
import java.math.*;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int j=0;j<n;j++) {
                double sum = 0;
                int x = scanner.nextInt();
                for(int i=1;i<=x;i++) {
                    sum += Math.log10(i);
                }
                System.out.println((int)sum + 1);
            }
        }
    }
}