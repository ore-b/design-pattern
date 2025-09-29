package kr.co.oreb.dp.strategy.duck.behavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
