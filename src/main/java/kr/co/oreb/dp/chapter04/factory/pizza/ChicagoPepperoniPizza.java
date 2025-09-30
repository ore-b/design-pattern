package kr.co.oreb.dp.chapter04.factory.pizza;

import kr.co.oreb.dp.chapter04.factory.ingredient.PizzaIngredientFactory;

public class ChicagoPepperoniPizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("시카고 페퍼로니 피자");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.dough = pizzaIngredientFactory.createDough();
        this.pepperoni = pizzaIngredientFactory.createPeperoni();
    }
}
