package graph;

/**
 * Created by liuhang on 2017/1/17.
 * KM算法,求二分图最大权匹配,指派问题之最大指派,java实现
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KM {
    private static final int INF = Integer.MAX_VALUE;

    private static int N; //顶点数
    private static int[][] weight;
    private static int[] lx;
    private static int[] ly;
    private static boolean[] visitx;
    private static boolean[] visity;
    private static int[] link;
    private static int[] slack;

    private static void init() {
        Arrays.fill(link, -1);
        Arrays.fill(ly, 0);
        for (int i = 0; i < N; i++) {
            lx[i] = -INF;
            for (int j = 0; j < N; j++) {
                if (weight[i][j] > lx[i]) {
                    lx[i] = weight[i][j];
                }
            }
        }

    }

    private static boolean hungary(int x) {
        visitx[x] = true;
        for (int y = 0; y < N; y++) {
            if (visity[y]) {
                continue;
            }
            int t = lx[x] + ly[y] - weight[x][y];//t=0,在相等子图中找匹配
            if (t == 0) {
                visity[y] = true;
                if (link[y] == -1 || hungary(link[y])) {
                    link[y] = x;
                    return true;
                }
            } else if (slack[y] > t) {
                slack[y] = t; //寻找增广路径时,顺便将slack值算出
            }
        }
        return false;
    }

    private static void KM() {
        init();
        for (int x = 0; x < N; x++) {
            Arrays.fill(slack, INF);
            while (true) {
                Arrays.fill(visitx, false);
                Arrays.fill(visity, false);
                if (hungary(x)) {
                    break;//找到增广轨,退出
                }
                int d = INF;
                for (int i = 0; i < N; i++) {
                    if (!visity[i] && d > slack[i]) {
                        d = slack[i];
                    }
                }
                for (int i = 0; i < N; i++) {
                    if (visitx[i])
                        lx[i] -= d;//修改x的顶标
                }
                for (int i = 0; i < N; i++) {
                    if (visity[i])
                        ly[i] += d;
                    else
                        slack[i] -= d;//修改顶标后,不在路径中的Y点的顶标要减d
                }
            }
        }
        //输出匹配结果
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (link[i] > -1) {
                System.out.println(i + "->" + link[i]);
                result += weight[link[i]][i];
            }
        }
        System.out.println("weight sum: " + result);
    }

    /**
     * 读取文件并按行输出字符
     *
     * @param spec 允许解析的最大行数， spec==null时，解析所有行
     * @author liuhang
     */
    public static String[] read(final String filePath, final Integer spec) {
        File file = new File(filePath);
        // 当文件不存在或者不可读时
        if ((!file.exists()) || (!file.canRead()) || (!file.isFile())) {
            System.out.println("file [" + filePath + "] is not exist or cannot read!!!");
            return null;
        }

        List<String> lines = new LinkedList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            int index = 0;
            while (((spec == null) || index++ < spec) && (str = br.readLine()) != null) {
                lines.add(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines.toArray(new String[lines.size()]);
    }

    /**
     * @param args 输入文件路径,输入文件中存n*n的cost矩阵,用逗号隔开
     * KM算法测试,求二分图最大权匹配(指派问题的最大指派)
     */
    public static void main(String[] args) {
        String graphPath = args[0];
        String[] matrix = read(graphPath, null);
        int i = 0;
        int n = 100;
        weight = new int[n][n];
        for (String line : matrix) {
            String[] contents = line.split(",");
            for (int j = 0; j < contents.length; j++) {
                weight[i][j] = Integer.parseInt(contents[j]);
            }
            i++;
        }
        N = i;
        link = new int[N];
        lx = new int[N];
        ly = new int[N];
        visitx = new boolean[N];
        visity = new boolean[N];
        slack = new int[N];
        KM();
    }
}

