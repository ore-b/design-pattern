package kr.co.oreb.dp.chapter04.factory.store;

import kr.co.oreb.dp.chapter04.factory.ingredient.NYPizzaIngredientFactory;
import kr.co.oreb.dp.chapter04.factory.pizza.NYCheesePizza;
import kr.co.oreb.dp.chapter04.factory.pizza.NYClaimPizza;
import kr.co.oreb.dp.chapter04.factory.pizza.NYPepperoniPizza;
import kr.co.oreb.dp.chapter04.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYCheesePizza(new NYPizzaIngredientFactory());
        } else if (type.equals("clam")) {
            pizza = new NYClaimPizza(new NYPizzaIngredientFactory());
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza(new NYPizzaIngredientFactory());
        }

        return pizza;
    }
}
