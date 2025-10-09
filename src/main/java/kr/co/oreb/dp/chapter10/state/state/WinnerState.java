package kr.co.oreb.dp.chapter10.state.state;

import kr.co.oreb.dp.chapter10.state.GumballMachine;

public class WinnerState implements State {

    GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateEnum state() {
        return StateEnum.WINNER;
    }

    @Override
    public void insertCoin() {
        System.out.println("알맹이가 나가는 중 입니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("이미 알맹이를 뽑으셨습니다. 알맹이가 나가는 중 입니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("알맹이가 나가는 중 입니다.");
    }

    @Override
    public void dispense() {

        System.out.println("축하합니다, 알맹이가 하나더 나갑니다.");

        machine.releaseBall();
        machine.releaseBall();

        int count = machine.getBallCount();

        if (count <= 0) {

            System.out.println("더 이상 알맹이가 없습니다.");

            machine.setCurrentState(StateEnum.SOLD_OUT);

        } else {

            machine.setCurrentState(StateEnum.NO_COIN);

        }
    }
}
