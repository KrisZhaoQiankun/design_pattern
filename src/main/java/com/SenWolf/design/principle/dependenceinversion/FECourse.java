package com.SenWolf.design.principle.dependenceinversion;

/**
 * @author SenWolf
 * @date 2021/12/9 18:17
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习FE课程");
    }
}
