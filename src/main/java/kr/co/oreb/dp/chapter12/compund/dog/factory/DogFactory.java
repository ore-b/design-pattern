package kr.co.oreb.dp.chapter12.compund.dog.factory;

import kr.co.oreb.dp.chapter12.compund.dog.Barkable;
import kr.co.oreb.dp.chapter12.compund.dog.Bulldog;
import kr.co.oreb.dp.chapter12.compund.dog.Poodle;
import kr.co.oreb.dp.chapter12.compund.dog.RubberDog;
import kr.co.oreb.dp.chapter12.compund.dog.adapter.Wolf;
import kr.co.oreb.dp.chapter12.compund.dog.adapter.WolfAdapter;

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
