package com.senwolf.design.geely.principle.liskovSubstitution;

/**
 * @author SenWolf
 * @date 2021/12/9 23:13
 */
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    /*public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }*/

    // 上面resize放入rectangle就可以，但是放入他的子类square就不行
    // 所以不符合里氏替换原则（不符合的根本原因是他重写了父类的方法）
    public static void main(String[] args) {
        Square square = new Square();
        // square.setSideLength(10);
        // resize(square);
    }

    // 最后换用Quadrangle解决了上面的问题
    // 因为没有set方法，所以resize方法里面不能传Square
}
