package kr.co.oreb.dp.cahpter01.strategy.duck;

import kr.co.oreb.dp.cahpter01.strategy.duck.behavior.FlyNoWay;
import kr.co.oreb.dp.cahpter01.strategy.duck.behavior.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }
}
