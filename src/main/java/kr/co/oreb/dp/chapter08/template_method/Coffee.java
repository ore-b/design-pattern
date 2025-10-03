package kr.co.oreb.dp.chapter08.template_method;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("커피 우려내기");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 커피 추가중");
    }
}
