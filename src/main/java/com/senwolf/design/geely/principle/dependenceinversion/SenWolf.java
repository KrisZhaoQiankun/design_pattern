package com.senwolf.design.geely.principle.dependenceinversion;

/**
 * @author SenWolf
 * @date 2021/12/9 18:07
 */
public class SenWolf {

    private ICourse iCourse;

    public SenWolf(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /*public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }*/

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

}
