package kr.co.oreb.dp.chapter10.state.state;

import kr.co.oreb.dp.chapter10.state.GumballMachine;

public class NoCoinState implements State {

    private GumballMachine machine;

    public NoCoinState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateEnum state() {
        return StateEnum.NO_COIN;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전을 넣으셨습니다.");
        machine.setCurrentState(StateEnum.HAS_COIN);
    }

    @Override
    public void ejectCoin() {
        System.out.println("반환할 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }
}
