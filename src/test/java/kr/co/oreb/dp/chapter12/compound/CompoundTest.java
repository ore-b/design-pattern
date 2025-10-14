package kr.co.oreb.dp.chapter12.compound;

import kr.co.oreb.dp.chapter12.compund.Barkable;
import kr.co.oreb.dp.chapter12.compund.Flock;
import kr.co.oreb.dp.chapter12.compund.decorator.BarkCounter;
import kr.co.oreb.dp.chapter12.compund.factory.AbstractDogFactory;
import kr.co.oreb.dp.chapter12.compund.factory.CountingDogFactory;
import kr.co.oreb.dp.chapter12.compund.observer.BarkOlogist;
import org.junit.jupiter.api.Test;

public class CompoundTest {

    @Test
    public void bark() {

        AbstractDogFactory dogFactory = new CountingDogFactory();
//        AbstractDogFactory dogFactory = new DogFactory();

        //개 무리
        Flock flockOfDog = new Flock();
        Barkable bulldog = dogFactory.createBulldog();
        flockOfDog.add(bulldog);
        Barkable poodle = dogFactory.createPoodle();
        flockOfDog.add(poodle);
        Barkable RubberDog = dogFactory.createRubberDog();
        flockOfDog.add(RubberDog);

        //늑대 무리
        Flock flockOfWolf = new Flock();
        flockOfWolf.add(dogFactory.createWolf());
        flockOfWolf.add(dogFactory.createWolf());
        flockOfWolf.add(dogFactory.createWolf());
        flockOfWolf.add(dogFactory.createWolf());

        //개 + 늑대 무리
        flockOfDog.add(flockOfWolf);

        //옵저버 생성(개짖는 소리 학자)
        BarkOlogist barkOlogist = new BarkOlogist();

        flockOfDog.registerObserver(barkOlogist);

        simulate(flockOfDog);

        System.out.println("총 짖은 횟수 : " + BarkCounter.BARK_COUNT);

    }

    private void simulate(Barkable barkable) {
        barkable.bark();
    }

}
