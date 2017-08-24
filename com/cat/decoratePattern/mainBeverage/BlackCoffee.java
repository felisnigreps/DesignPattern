package com.cat.decoratePattern.mainBeverage;

/**
 * Created by gxu on 2016/12/14.
 */

public class BlackCoffee implements DrinkStartBuzz {
    //只是为了便于理解 正常开发会有实体类对应
    String id = "B2";

    public double cost() {
        return 4;
    }

    public String description() {
        return "this is a delicious coffee";
    }
}
