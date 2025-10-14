package kr.co.oreb.dp.chapter12.compund.dog.factory;

import kr.co.oreb.dp.chapter12.compund.dog.Barkable;
import kr.co.oreb.dp.chapter12.compund.dog.Bulldog;
import kr.co.oreb.dp.chapter12.compund.dog.Poodle;
import kr.co.oreb.dp.chapter12.compund.dog.RubberDog;
import kr.co.oreb.dp.chapter12.compund.dog.adapter.Wolf;
import kr.co.oreb.dp.chapter12.compund.dog.adapter.WolfAdapter;
import kr.co.oreb.dp.chapter12.compund.dog.decorator.BarkCounter;

public class CountingDogFactory extends AbstractDogFactory {

    @Override
    public Barkable createPoodle() {
        return new BarkCounter(new Poodle());
    }

    @Override
    public Barkable createBulldog() {
        return new BarkCounter(new Bulldog());
    }

    @Override
    public Barkable createRubberDog() {
        return new BarkCounter(new RubberDog());
    }

    @Override
    public Barkable createWolf() {
        return new BarkCounter(new WolfAdapter(new Wolf()));
    }
}
