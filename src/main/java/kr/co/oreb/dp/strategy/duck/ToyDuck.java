package kr.co.oreb.dp.strategy.duck;

import kr.co.oreb.dp.strategy.duck.behavior.FlyBehavior;
import kr.co.oreb.dp.strategy.duck.behavior.FlyWithWings;
import kr.co.oreb.dp.strategy.duck.behavior.QuackBehavior;
import kr.co.oreb.dp.strategy.duck.behavior.Squeak;

public class ToyDuck extends Duck {


    public ToyDuck() {
        super(new FlyWithWings(), new Squeak());
    }
}
