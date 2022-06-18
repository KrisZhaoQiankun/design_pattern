package com.senwolf.design.geely.principle.openclose;

/**
 * @author SenWolf
 * @date 2021/11/25 17:07
 */
public class Test {
    public static void main(String[] args) {
        //开始的需求：可以获取课程id name price就好了
        /*ICourse iCourse = new JavaCourse(96, "deginpattern", 300d);
        System.out.println("Id："+iCourse.getId()+"名称："+iCourse.getName()+"价格："+iCourse.getPrice());*/
        /**
         * 后来的需求：节日要打折，要可以获取课程id name price discountPrice
         * 以前的做法：在ICourse中修改，加一个getDiscountPrice，实现类在原来price的基础上×一个系数
         *           接口应该是可靠的，修改接口和对应的实现类都可能会影响很多模块
         * 现在的做法：开闭原则：对扩展开放(用一个新的类来继承JavaCourse来实现扩展)，对修改封闭（不更改原来的接口和JavaCourse实现类从而减少对其他模块的影响）
         * 实现：使用一个类来继承原来的JavaCourse,然后实现getDiscountPrice()方法,使用子类的时候要强转一下，不然无法用子类的方法
         *
         */
        ICourse iCourse = new JavaDiscountCourse(96, "deginpattern", 300d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("Id："+javaDiscountCourse.getId()+"名称："+javaDiscountCourse.getName()+"价格："+javaDiscountCourse.getPrice()+"折扣后价格："+javaDiscountCourse.getDiscountPrice());
    }
}
