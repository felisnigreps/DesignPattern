package com.cat.decoratePattern.subBerverage;

/**
 * Created by gxu on 2016/12/14.
 */
public class SugarBuzz implements Ingredients {

    String id = "I1";

    @Override
    public double cost() {
        return 0.2;
    }
    @Override
    public String description() {
        return "Sugar, we all like it";
    }
}
