package com.SenWolf.design.principle.singleresponsibility;

/**
 * @author SenWolf
 * @date 2021/12/9 14:19
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
