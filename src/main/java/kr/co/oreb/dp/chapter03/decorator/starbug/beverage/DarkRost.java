package kr.co.oreb.dp.chapter03.decorator.starbug.beverage;

public class DarkRost implements Beverage {

    private final int size;

    public DarkRost(int size) {
        this.size = size;
    }

    @Override
    public String getDesc() {
        return "다크로스트";
    }

    @Override
    public int cost() {
        return 3000;
    }

    @Override
    public int size() {
        return size;
    }
}
