import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long second = scanner.nextLong();
        long hour = second / 3600;
        long minute = (second - hour*3600) / 60;
        second = second - hour*3600 - minute*60;
        System.out.println(String.format("%d小时%d分钟%d秒", hour, minute, second)); 
    }
}