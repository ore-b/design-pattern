package kr.co.oreb.dp.strategy.duck;

import kr.co.oreb.dp.strategy.duck.behavior.FlyWithWings;
import kr.co.oreb.dp.strategy.duck.behavior.Quack;

//청둥오리
public class MallardDuck extends Duck {

    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }

}
