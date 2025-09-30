package kr.co.oreb.dp.chapter04.factory.pizza;

import kr.co.oreb.dp.chapter04.factory.ingredient.PizzaIngredientFactory;

public class NYClaimPizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYClaimPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("뉴욕 조개 피자");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.dough = pizzaIngredientFactory.createDough();
        this.clam = pizzaIngredientFactory.createClam();
    }
}
