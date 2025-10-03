package kr.co.oreb.dp.chapter08.template_method;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("차 우려내기");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬 추가 하기");
    }
}
