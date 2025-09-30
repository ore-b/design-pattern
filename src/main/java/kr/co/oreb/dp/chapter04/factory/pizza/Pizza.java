package kr.co.oreb.dp.chapter04.factory.pizza;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Pizza {

    private final String name;

    protected String dough;

    protected String sauce;

    protected String cheese;

    protected String pepperoni;

    protected String clam;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 피자를 굽는다");
    }

    public void cut() {
        System.out.println(name + " 피자를 자른다");
    }

    public void box() {
        System.out.println(name + " 피자를 박스에 담는다");
    }

    public void summary() {
        System.out.println(
            "name : " + name + ", dough : " + dough + " , sauce : " + sauce + " , cheese : "
                + cheese + " , pepperoni : " + pepperoni + " , clam : " + clam);
    }

}
