package kr.co.oreb.dp.cahpter01.strategy.duck.behavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날개를 이용해서 난다");
    }
}
