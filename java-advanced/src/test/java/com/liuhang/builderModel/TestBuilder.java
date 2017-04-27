package com.liuhang.builderModel;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/9.
 */
public class TestBuilder {
    @Test
    public void test() {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1, 2).setCarbohydrate(1).build();
    }
}
