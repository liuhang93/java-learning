package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuhang on 2017/2/8.
 */
public class FileUtil {
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
}
