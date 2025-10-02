package kr.co.oreb.dp.chapter06.command.remote.receiver;

public class CeilingFan {

    public static final int OFF = 0;
    public static final int HIGH = 1;
    public static final int MEDIUM = 2;
    public static final int LOW = 3;

    private int speed;

    public CeilingFan() {
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }


}
