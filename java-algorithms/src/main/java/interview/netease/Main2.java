package interview.netease;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题2： 优雅的点
 * https://www.nowcoder.com/question/next?pid=2811407&qid=46572&tid=7344945
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//平方
        int square = in.nextInt();
        int count = 0;
        int x = 1;
        while (x <= Math.sqrt(square)) {
            int y_square = square - x * x;
            double y = Math.sqrt(y_square);
            if (y - Math.floor(y) == 0) {
                count++;
            }
            x++;
        }
        System.out.println(count * 4);

    }
}
