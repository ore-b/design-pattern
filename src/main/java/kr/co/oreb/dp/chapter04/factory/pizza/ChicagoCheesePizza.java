package kr.co.oreb.dp.chapter04.factory.pizza;

import kr.co.oreb.dp.chapter04.factory.ingredient.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("시카고 치즈 피자");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.dough = pizzaIngredientFactory.createDough();
    }
}
