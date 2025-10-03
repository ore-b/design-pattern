package kr.co.oreb.dp.chapter07_2.facade;

public class HouseTheaterFacade {

    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;

    public HouseTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie() {
        dvdPlayer.on();
        projector.on();
        screen.on();
    }

    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        screen.off();
    }

}
