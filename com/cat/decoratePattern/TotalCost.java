package com.cat.decoratePattern;

import com.cat.decoratePattern.mainBeverage.DrinkStartBuzz;
import com.cat.decoratePattern.subBerverage.Ingredients;
import com.cat.decoratePattern.subBerverage.SugarBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by gxu on 2016/12/14.
 */
public class TotalCost {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //读取用户所要饮料
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //按钮绑定ID 此例中B1I1 为摩卡加糖，先关信息可以定义到数据库中，可以自定义相关的Util类来解析，在此省略过程,使用控制台输入来模拟
        // String s = reader.readLine();
        //计算价格逻辑 通过数据库可以查询出B1I1为mocha  用spring就更容易解决了
        //  ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factoryMethod.xml");
        // DrinkStartBuzz coffee = (DrinkStartBuzz) ctx.getBean("MochaCoffee");
        String getFromUtil = "MochaCoffee";
        Class newClass = Class.forName("BlackCoffee");
        DrinkStartBuzz coffee = (DrinkStartBuzz) newClass.newInstance();
        //配料同理
        Ingredients mix = new SugarBuzz();
        System.out.println(coffee.cost() + mix.cost()+"$");


    }
}
