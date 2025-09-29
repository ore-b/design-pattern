package kr.co.oreb.dp.strategy.duck;

import kr.co.oreb.dp.strategy.duck.behavior.FlyBehavior;
import kr.co.oreb.dp.strategy.duck.behavior.FlyNoWay;
import kr.co.oreb.dp.strategy.duck.behavior.MuteQuack;
import kr.co.oreb.dp.strategy.duck.behavior.QuackBehavior;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }
}
