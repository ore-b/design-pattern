package kr.co.oreb.dp.chapter04.factory.ingredient;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String createDough() {
        return "Chicago Dough";
    }

    @Override
    public String createSauce() {
        return "Chicago Sauce";
    }

    @Override
    public String createPeperoni() {
        return "Chicago Peperoni";
    }

    @Override
    public String createCheese() {
        return "Chicago Cheese";
    }

    @Override
    public String createClam() {
        return "Chicago Clam";
    }
}
