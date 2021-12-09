package com.SenWolf.design.principle.demeter;

import java.util.ArrayList;

/**
 * @author SenWolf
 * @date 2021/12/9 20:30
 */
public class TeamLeader {

    public void checkNumberOfCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i< 20; i++) {
            courses.add(new Course());
        }

        System.out.println("在线课程的数量是："+courses.size());
    }
}
