package com.senwolf.design.geely.principle.dependenceinversion;

/**
 * @author SenWolf
 * @date 2021/12/9 18:16
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
