package kr.co.oreb.dp.chapter04.factory.store;

import kr.co.oreb.dp.chapter04.factory.ingredient.ChicagoPizzaIngredientFactory;
import kr.co.oreb.dp.chapter04.factory.pizza.ChicagoCheesePizza;
import kr.co.oreb.dp.chapter04.factory.pizza.ChicagoClaimPizza;
import kr.co.oreb.dp.chapter04.factory.pizza.ChicagoPepperoniPizza;
import kr.co.oreb.dp.chapter04.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza(new ChicagoPizzaIngredientFactory());
        } else if (type.equals("clam")) {
            pizza = new ChicagoClaimPizza(new ChicagoPizzaIngredientFactory());
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza(new ChicagoPizzaIngredientFactory());
        }

        return pizza;
    }
}
