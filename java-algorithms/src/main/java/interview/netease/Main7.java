package interview.netease;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题7： 买苹果
 * https://www.nowcoder.com/question/next?pid=2811407&qid=46572&tid=7359198
 */
public class Main7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 6) {
            System.out.println(-1);
            return;
        }
        if (n % 2 != 0) {
            System.out.println(-1);
            return;
        } else {
            n /= 2;
        }
        int i = 1;
        while (3 * i <= n) {
            int temp = n - 3 * i;
            if (temp <= i) {
                System.out.println(i);
                break;
            } else {
                i++;
            }
        }
    }
}
