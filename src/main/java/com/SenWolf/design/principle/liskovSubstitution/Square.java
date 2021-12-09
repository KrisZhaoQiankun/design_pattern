package com.SenWolf.design.principle.liskovSubstitution;

/**
 * @author SenWolf
 * @date 2021/12/9 23:10
 */
public class Square implements Quadrangle {

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }


    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
