package com.senwolf.design.geely.pattern.creational.builder;

/**
 * @author SenWolf
 * @date 2022/1/19 20:36
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(courseName);
        this.courseBuilder.buildCourseVideo(courseName);
        this.courseBuilder.buildCourseArticle(courseName);
        this.courseBuilder.buildCourseQA(courseName);
        return this.courseBuilder.makeCourse();
    }
}
