package kr.co.oreb.dp.chapter07_1.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void adapterTest() {
        Duck duck = new TurkeyAdapter(new WildTurkey());

        duck.fly();
        duck.gobble();
    }

}
