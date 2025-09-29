package kr.co.oreb.dp.cahpter01.strategy.duck;

import kr.co.oreb.dp.cahpter01.strategy.duck.behavior.FlyBehavior;
import kr.co.oreb.dp.cahpter01.strategy.duck.behavior.QuackBehavior;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;


    public void performQuack() {
        flyBehavior.fly();
    }

    public void performFly() {
        quackBehavior.quack();
    }

}
