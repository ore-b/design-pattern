package kr.co.oreb.dp.strategy.duck.behavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삑~");
    }
}
