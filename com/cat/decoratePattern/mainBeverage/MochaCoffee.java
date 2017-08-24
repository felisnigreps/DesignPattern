package com.cat.decoratePattern.mainBeverage;

/**
 * Created by gxu on 2016/12/14.
 */
public class MochaCoffee implements DrinkStartBuzz {
    //只是为了便于理解 正常开发会有实体类/数据库表对应
    String id = "B1";

    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String description() {
        return "this is a delicious coffee";
    }
}
