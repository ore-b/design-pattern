package kr.co.oreb.dp.chapter03.decorator.starbug.beverage;

public class Espresso implements Beverage {

    private final int size;

    public Espresso(int size) {
        this.size = size;
    }

    @Override
    public String getDesc() {
        return "에스프레소";
    }

    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public int size() {
        return size;
    }
}
