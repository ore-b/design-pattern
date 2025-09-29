package kr.co.oreb.dp.chapter03.decorator.starbug.decorator;

import kr.co.oreb.dp.chapter03.decorator.starbug.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", 두유";
    }

    @Override
    public int cost() {

        int optionCost;

        if (size() <= 1) {
            optionCost = 500;
        } else if (size() == 2) {
            optionCost = 700;
        } else {
            optionCost = 1000;
        }

        return beverage.cost() + optionCost;
    }
}
