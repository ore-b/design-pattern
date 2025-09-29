package kr.co.oreb.dp.cahpter01.strategy.duck.behavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑~");
    }
}
