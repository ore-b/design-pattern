package kr.co.oreb.dp.chapter07_1.adapter;


public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void gobble() {
        turkey.gobble();
    }
}
