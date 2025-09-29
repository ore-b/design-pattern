package kr.co.oreb.dp.chapter03.decorator.starbug.decorator;

import kr.co.oreb.dp.chapter03.decorator.starbug.beverage.Beverage;

public abstract class CondimentDecorator implements Beverage {

    protected final Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    //여기에 토핑들만의 공통 코드를 작성 할 수도 있다.
    public int size() {
        return beverage.size();
    }
}
