package com.senwolf.design.geely.principle.demeter;

/**
 * @author SenWolf
 * @date 2021/12/9 18:40
 */
public class Test {
    /**
     * 迪米特原则：
     * 定义：一个对象应该对其他对象保持最少的了解。又叫最少知道原则
     * 尽量降低类与类之间的耦合
     * 优点：降低类之间的耦合
     *
     * 强调：
     * 只和朋友交流，不和陌生人说话
     * 朋友：出现在成员变量、方法的输入、输出参数中的类成为成员朋友类
     * 而出现在方法体内部的类不属于朋友类
     */
    public static void main(String[] args) {
        // 一开始的时候课程的信息是在Boss类里面的
        // 但是boss想要的只是查看有多少们课程，不需要跟课程类相关
        // 所以只要向teamleader下达查看有多少们课程的命令就可以了
        // 所以就把Course相关迁移到了TeamLeader中
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
