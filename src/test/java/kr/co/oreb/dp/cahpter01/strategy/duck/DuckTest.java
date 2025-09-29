package kr.co.oreb.dp.cahpter01.strategy.duck;

import java.util.List;
import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    void testDuck() {

        List<Duck> ducks = List.of(new MallardDuck(), new ModelDuck(), new ToyDuck());

        ducks.forEach(duck -> {
            duck.performFly();
            duck.performQuack();
        });

    }

}
