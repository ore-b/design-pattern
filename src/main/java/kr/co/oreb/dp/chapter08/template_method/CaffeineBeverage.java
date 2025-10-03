package kr.co.oreb.dp.chapter08.template_method;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끌이기");
    }

    void pourInCup() {
        System.out.println("컵에 따르기");
    }

}
