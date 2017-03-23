package interview.netease;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题5： 数字翻转
 * https://www.nowcoder.com/question/next?pid=2811407&qid=46575&tid=7348975
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int rev_x = rev(x);
        int rev_y = rev(y);
        System.out.println(rev(rev_x + rev_y));
    }

    private static int rev(int k) {
        int count = 0;
        int rev = 0;
        while (k > 0) {
            int temp = k % 10;
            if (count == 0 && temp == 0) {
                k = k / 10;
            } else {
                rev = rev * 10 + temp;
                count++;
                k = k / 10;
            }
        }
        return rev;
    }
}
