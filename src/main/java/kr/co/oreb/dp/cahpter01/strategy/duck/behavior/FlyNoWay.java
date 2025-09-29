package kr.co.oreb.dp.cahpter01.strategy.duck.behavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날지 못한다");
    }
}
