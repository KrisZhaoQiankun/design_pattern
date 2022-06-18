package com.senwolf.design.geely.principle.singleresponsibility;

/**
 * @author SenWolf
 * @date 2021/12/9 0:36
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if("鸵鸟".equals(birdName)) {
            System.out.println(birdName+"用脚走");
        } else {
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
