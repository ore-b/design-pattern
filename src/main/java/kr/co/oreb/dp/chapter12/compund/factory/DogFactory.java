package kr.co.oreb.dp.chapter12.compund.factory;

import kr.co.oreb.dp.chapter12.compund.Barkable;
import kr.co.oreb.dp.chapter12.compund.Bulldog;
import kr.co.oreb.dp.chapter12.compund.Poodle;
import kr.co.oreb.dp.chapter12.compund.RubberDog;
import kr.co.oreb.dp.chapter12.compund.adapter.Wolf;
import kr.co.oreb.dp.chapter12.compund.adapter.WolfAdapter;

public class DogFactory extends AbstractDogFactory {

    @Override
    public Barkable createPoodle() {
        return new Poodle();
    }

    @Override
    public Barkable createBulldog() {
        return new Bulldog();
    }

    @Override
    public Barkable createRubberDog() {
        return new RubberDog();
    }

    @Override
    public Barkable createWolf() {
        return new WolfAdapter(new Wolf());
    }
}
