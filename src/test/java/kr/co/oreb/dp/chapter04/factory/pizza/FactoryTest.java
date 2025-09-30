package kr.co.oreb.dp.chapter04.factory.pizza;

import kr.co.oreb.dp.chapter04.factory.store.ChicagoPizzaStore;
import kr.co.oreb.dp.chapter04.factory.store.NYPizzaStore;
import kr.co.oreb.dp.chapter04.factory.store.PizzaStore;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void pizzaFactoryTest() {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        System.out.println("-----");
        nyPizzaStore.orderPizza("cheese").summary();
        System.out.println("-----");
        nyPizzaStore.orderPizza("clam").summary();
        System.out.println("-----");
        nyPizzaStore.orderPizza("pepperoni").summary();
        System.out.println("-----");

        PizzaStore cheesePizzaStore = new ChicagoPizzaStore();
        System.out.println("-----");
        cheesePizzaStore.orderPizza("cheese").summary();
        System.out.println("-----");
        cheesePizzaStore.orderPizza("clam").summary();
        System.out.println("-----");
        cheesePizzaStore.orderPizza("pepperoni").summary();
        System.out.println("-----");
    }

}
