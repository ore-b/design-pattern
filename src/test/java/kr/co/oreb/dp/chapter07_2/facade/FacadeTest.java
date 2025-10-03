package kr.co.oreb.dp.chapter07_2.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void facade() {
        HouseTheaterFacade houseTheaterFacade = new HouseTheaterFacade(new DvdPlayer(),
            new Projector(), new Screen());
        houseTheaterFacade.watchMovie();
        houseTheaterFacade.endMovie();
    }

}
