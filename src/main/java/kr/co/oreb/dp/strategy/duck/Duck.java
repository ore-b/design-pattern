package kr.co.oreb.dp.strategy.duck;

import kr.co.oreb.dp.strategy.duck.behavior.FlyBehavior;
import kr.co.oreb.dp.strategy.duck.behavior.QuackBehavior;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;


    public void performQuack(){
        flyBehavior.fly();
    }

    public void performFly(){
        quackBehavior.quack();
    }

}
