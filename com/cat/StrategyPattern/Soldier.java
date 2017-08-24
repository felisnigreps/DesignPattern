package com.cat.StrategyPattern;

/**
 * Created by gxu on 2017/2/15.
 */
public abstract class Soldier {

    protected String name;

    protected void attack() {
        System.out.println("攻击");
    }

    protected void move() {
        System.out.println("移动");
    }


    protected Skill skillA;
    protected Skill skillB;
    protected Skill skillC;


    public Skill getSkillA() {
        return skillA;
    }

    //这么写在实例化的时候可以set().set().  感觉有点像builder方法
    public Soldier setSkillA(Skill skillA) {
        this.skillA = skillA;
        return this;
    }

    public Skill getSkillB() {
        return skillB;
    }

    public Soldier setSkillB(Skill skillB) {
        this.skillB = skillB;
        return this;

    }

    public Skill getSkillC() {
        return skillC;
    }

    public Soldier setSkillC(Skill skillC) {
        this.skillC = skillC;
        return this;

    }



}
