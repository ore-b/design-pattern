package kr.co.oreb.dp.chapter10.state.state;

import kr.co.oreb.dp.chapter10.state.GumballMachine;

public class SoldOutState implements State {

    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateEnum state() {
        return StateEnum.SOLD_OUT;
    }

    @Override
    public void insertCoin() {
        System.out.println("매진 되었습니다. 다음기회에 이용해주세요.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("매진상태에는 동전을 넣을 수 없습니다. 동전이 반환되지 않습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진 되었습니다. 다음기회에 이용해주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("매진 되었습니다. 다음기회에 이용해주세요.");
    }
}
