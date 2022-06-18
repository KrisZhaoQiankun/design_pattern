package com.senwolf.design.geely.principle.singleresponsibility;

/**
 * @author SenWolf
 * @date 2021/12/9 14:34
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
