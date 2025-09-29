package kr.co.oreb.dp.cahpter01.strategy.duck;

import kr.co.oreb.dp.cahpter01.strategy.duck.behavior.FlyWithWings;
import kr.co.oreb.dp.cahpter01.strategy.duck.behavior.Squeak;

public class ToyDuck extends Duck {


    public ToyDuck() {
        super(new FlyWithWings(), new Squeak());
    }
}
