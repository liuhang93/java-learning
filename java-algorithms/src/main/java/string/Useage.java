package string;

import org.junit.Test;

/**
 * Created by liuhang on 2016/12/27.
 * String基本用法
 * StringBuilder 构建字符串,单线程,效率高;StringBuffer 保证线程安全
 */
public class Useage {
    @Test
    public void stringUseage(){
        String s1 = new String();
        String s2 = "liuhang";
        int x=s2.indexOf(3);
        int s2Lenth = s2.length();
        s2.substring(1,3);
        StringBuilder s3 = new StringBuilder(s2.substring(1, 3));
        s3.append("@hust");
    }
}
