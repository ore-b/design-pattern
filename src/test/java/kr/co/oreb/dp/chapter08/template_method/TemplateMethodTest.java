package kr.co.oreb.dp.chapter08.template_method;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    void caffeineTest() {
        System.out.println("=====홍차 주문=====");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("=====커피 주문=====");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
