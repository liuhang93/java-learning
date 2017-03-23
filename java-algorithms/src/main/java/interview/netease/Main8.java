package interview.netease;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题8： 计算糖果
 * https://www.nowcoder.com/question/next?pid=2811407&qid=46578&tid=7359198
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = in.nextInt();
        }
        int temp = array[1] + array[3];
        if (temp != (array[2] - array[0]) || temp % 2 != 0) {
            System.out.println("No");
        } else {
            int b = temp / 2;
            int a = (array[0] + array[2]) / 2;
            int c = (array[3] - array[1]) / 2;
            System.out.println(a + " " + b + " " + c);
        }
    }
}
