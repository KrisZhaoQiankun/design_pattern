package com.senwolf.design.geely.pattern.creational.builder;

/**
 * @author SenWolf
 * @date 2022/1/19 20:31
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
