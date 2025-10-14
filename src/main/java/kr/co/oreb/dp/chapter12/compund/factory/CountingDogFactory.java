package kr.co.oreb.dp.chapter12.compund.factory;

import kr.co.oreb.dp.chapter12.compund.Barkable;
import kr.co.oreb.dp.chapter12.compund.Bulldog;
import kr.co.oreb.dp.chapter12.compund.Poodle;
import kr.co.oreb.dp.chapter12.compund.RubberDog;
import kr.co.oreb.dp.chapter12.compund.adapter.Wolf;
import kr.co.oreb.dp.chapter12.compund.adapter.WolfAdapter;
import kr.co.oreb.dp.chapter12.compund.decorator.BarkCounter;

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
