package com.SenWolf.design.principle.singleresponsibility;

/**
 * @author SenWolf
 * @date 2021/12/9 0:37
 */
public class Test {
    public static void main(String[] args) {
        // 在类的职责上

        Bird bird = new Bird();
        // 一开始的需求只有大雁
        bird.mainMoveMode("大雁");
        // 后来又来了一个鸵鸟，肯定不能飞，所以改了Bird类，加了一个鸵鸟的判断
        // 但是由于修改代码的时候没改好，没有将原来的代码加入else语句中，所以对原来的功能有了影响
        // 所以加上了else就好了
        bird.mainMoveMode("鸵鸟");
        // 工作的业务逻辑要复杂的多，所以我们要做好单一职责原则,每个类的职责单一
        //
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

        // 在实际的项开发中
        // 接口和方法一定要做到单一职责，维护起来方便成本低，类的单一职责原则要根据实际情况来

    }
}
