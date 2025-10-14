package kr.co.oreb.dp.chapter12.compund.factory;

import kr.co.oreb.dp.chapter12.compund.Barkable;

public abstract class AbstractDogFactory {

    public abstract Barkable createPoodle();

    public abstract Barkable createBulldog();

    public abstract Barkable createRubberDog();

    public abstract Barkable createWolf();

}
