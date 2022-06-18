package com.senwolf.design.geely.principle.dependenceinversion;

/**
 * @author SenWolf
 * @date 2021/12/9 18:02
 */
public class Test {
    /**
     * 依赖倒置原则：
     * 定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象
     * 抽影不应该依赖细节，细节应该依赖抽象
     * 针对接口编程，不要针对实现编程
     * 有点：可以减少类间的耦合性、提高系统稳定性、提高代码可读性和维护性，可以降低修改程序所造成的风险
     */
    public static void main(String[] args) {
        // v1
        // SenWolf senWolf = new SenWolf();
        // 原本的需求是学习JavaCourse和FECourse,但是后面要学习Python课程
        // senWolf.studyJavaCourse();
        // senWolf.studyFECourse();
        // 所以就在SenWolf中加入了一个studyPython的方法，这就是典型的面向实现编程（应用层的修改是依赖底层实现的）
        // senWolf.studyPythonCourse();

        // v2通过接口方法的形式注入实例
        // senWolf.studyImoocCourse(new JavaCourse());

        // v3通过构造器的方式注入Course实例
        SenWolf senWolf = new SenWolf(new JavaCourse());
        senWolf.studyImoocCourse();

        // v4前面的构造器注入有点不好，想要学习新的课程的时候要新建SenWolf实例，所以用setter注入
        senWolf.setiCourse(new FECourse());
        senWolf.studyImoocCourse();

        // 核心思想：面向接口编程
    }
}
