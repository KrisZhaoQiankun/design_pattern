package com.SenWolf.design.principle.interfacegregation;

/**
 * @author SenWolf
 * @date 2021/12/8 22:32
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 接口隔离原则：
         * 定义：用多个专门的接口，而不是使用单一的总接口，客户端不因该依赖它不需要的接口
         * 一个类对一个类的依赖应该建立在最小的接口上
         * 建议单一接口，不要建立庞大臃肿的接口
         * 尽量接口细化，接口中的方法尽量少
         *
         * 注意适度原则，一定要适度
         * 优点：复合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性，可扩展性和可维护性
         *
         * 接口隔离原则和单一职责原则的区别
         * 接口隔离原则：低耦合
         * 单一职责原则：高内聚
         * 通俗的解释：一个公司为了方便管理，需要把员工分成很多部门(接口隔离原则)，但是IT部门只做和IT技术相关的工作(单一职责原则),专业的人做专业的事情
         *
         */

        // System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
    }
}
