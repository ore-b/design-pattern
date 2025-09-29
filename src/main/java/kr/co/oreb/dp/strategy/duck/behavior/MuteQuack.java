package kr.co.oreb.dp.strategy.duck.behavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("....");
    }
}
