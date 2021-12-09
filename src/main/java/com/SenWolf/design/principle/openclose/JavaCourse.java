package com.SenWolf.design.principle.openclose;

/**
 * @author SenWolf
 * @date 2021/11/25 17:04
 */
public class JavaCourse implements ICourse{

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
