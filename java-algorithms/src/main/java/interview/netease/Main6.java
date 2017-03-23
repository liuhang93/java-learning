package interview.netease;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题6： 最大的奇约数
 * https://www.nowcoder.com/question/next?pid=2811407&qid=46576&tid=7348975
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long sum = 0;
        //求1到n中所有奇数的和的方法！
        for (long i = n; i > 0; i = i / 2) {
            sum += ((i + 1) / 2) * ((i + 1) / 2);
        }
        System.out.println(sum);
    }

}
