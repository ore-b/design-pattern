package kr.co.oreb.dp.chapter10.state.state;

import java.util.Random;
import kr.co.oreb.dp.chapter10.state.GumballMachine;

public class HasCoinState implements State {

    private GumballMachine machine;

    public HasCoinState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateEnum state() {
        return StateEnum.HAS_COIN;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전은 한개만 넣어주세요");
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전이 반환됩니다.");
        machine.setCurrentState(StateEnum.NO_COIN);
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸습니다.");

        Random random = new Random(System.currentTimeMillis());

        int winner = random.nextInt(5);

        if (winner == 0 && 1 < machine.getBallCount()) {
            machine.setCurrentState(StateEnum.WINNER);
        } else {
            machine.setCurrentState(StateEnum.SOLD);
        }

        machine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 나갈수 없습니다.");
    }
}
