package com.liuhang.generic;

import org.junit.Test;

/**
 * Created by liuhang on 2017/3/8.
 */
public class PairTest {
    @Test
    public void testPair(){
        Pair<String> pair = new Pair<>("a", "b");
        System.out.println(pair.getFirst());
    }
}
