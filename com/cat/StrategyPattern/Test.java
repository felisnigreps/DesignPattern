package com.cat.StrategyPattern;

/**
 * Created by gxu on 2017/2/15.
 */
public class Test {
    public static void main(String[] args) {
        //如果我们想创建一个小兵，这样就好了
        //如果想扩充技能 只要新加类也没问题 实现开闭原则
        Soldier a = new A("Hammer");
        //a.setSkillA(new Fenlie()).setSkillC(new Yaoshu());
        a.setSkillA(new Fenlie()).setSkillB(new Baofengxue()).setSkillC(new Yaoshu());

        a.getSkillA().skillDetail();
        a.getSkillB().skillDetail();
        a.getSkillC().skillDetail();

    }
}
