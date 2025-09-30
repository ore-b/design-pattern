package kr.co.oreb.dp.chapter04.factory.store;

import kr.co.oreb.dp.chapter04.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
