import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Switch {
    public static void main(String[] args) {
        int score, flag;
        System.out.println("您的考分是多少？");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            score = scanner.nextInt();

            if(score>=90&&score<=100) {
                flag = 5;
            }
            else if(score>=80&&score<90) {
                flag = 4;
            }
            else if(score>=70&&score<80) {
                flag = 3;
            }
            else if(score>=60&&score<70) {
                flag = 2;
            }
            else {
                flag = 1;
            }

            switch(flag)
            {
                case 5 : System.out.println("优");break;
                case 4 : System.out.println("良");break;
                case 3 : System.out.println("中");break;
                case 2 : System.out.println("及格");break;
                case 1 : System.out.println("不及格");break;
            }
        }
    }
}