package com.SenWolf.design.principle.demeter;

/**
 * @author SenWolf
 * @date 2021/12/9 20:30
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader)  {
        teamLeader.checkNumberOfCourses();
    }
}
