package com.senwolf.design.geely.principle.openclose;

/**
 * @author SenWolf
 * @date 2021/11/25 17:14
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice()*0.8;
    }
}
