package kr.co.oreb.dp.chapter04.factory.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String createDough() {
        return "NY Dough";
    }

    @Override
    public String createSauce() {
        return "NY Sauce";
    }

    @Override
    public String createPeperoni() {
        return "NY Peperoni";
    }

    @Override
    public String createCheese() {
        return "NY Cheese";
    }

    @Override
    public String createClam() {
        return "NY Clam";
    }
}
