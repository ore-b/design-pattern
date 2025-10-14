package kr.co.oreb.dp.chapter12.compound;

import kr.co.oreb.dp.chapter12.compund.dog.Barkable;
import kr.co.oreb.dp.chapter12.compund.dog.Flock;
import kr.co.oreb.dp.chapter12.compund.dog.decorator.BarkCounter;
import kr.co.oreb.dp.chapter12.compund.dog.factory.AbstractDogFactory;
import kr.co.oreb.dp.chapter12.compund.dog.factory.CountingDogFactory;
import kr.co.oreb.dp.chapter12.compund.dog.observer.BarkOlogist;
import kr.co.oreb.dp.chapter12.compund.mvc.controller.BeatBeatController;
import kr.co.oreb.dp.chapter12.compund.mvc.model.BeatModel;
import kr.co.oreb.dp.chapter12.compund.mvc.model.BeatModelInterface;
import kr.co.oreb.dp.chapter12.compund.mvc.view.DJView;
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

    @Test
    void MVCTest() {
        BeatModelInterface beatModel = new BeatModel();
        DJView view = new DJView(new BeatBeatController(beatModel), beatModel);

        view.pressStartButton();
        view.pressIncreaseBPM();
        view.pressDecreaseBPM();
        view.setBPM(100);
        view.pressStopButton();
    }

}
