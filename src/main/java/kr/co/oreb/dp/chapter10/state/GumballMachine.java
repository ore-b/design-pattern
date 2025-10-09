package kr.co.oreb.dp.chapter10.state;

import java.util.HashMap;
import java.util.Map;
import kr.co.oreb.dp.chapter10.state.state.HasCoinState;
import kr.co.oreb.dp.chapter10.state.state.NoCoinState;
import kr.co.oreb.dp.chapter10.state.state.SoldOutState;
import kr.co.oreb.dp.chapter10.state.state.SoldState;
import kr.co.oreb.dp.chapter10.state.state.State;
import kr.co.oreb.dp.chapter10.state.state.StateEnum;
import kr.co.oreb.dp.chapter10.state.state.WinnerState;
import lombok.Getter;

@Getter
public class GumballMachine {

    private State currentState;

    private int ballCount;

    private final Map<StateEnum, State> stateMap;

    public GumballMachine() {
        this.ballCount = 5;
        this.stateMap = new HashMap<>();

        this.currentState = new NoCoinState(this);
        stateMap.put(StateEnum.NO_COIN, currentState);
        stateMap.put(StateEnum.HAS_COIN, new HasCoinState(this));
        stateMap.put(StateEnum.SOLD, new SoldState(this));
        stateMap.put(StateEnum.SOLD_OUT, new SoldOutState(this));
        stateMap.put(StateEnum.WINNER, new WinnerState(this));

    }

    public void setCurrentState(StateEnum state) {
        currentState = stateMap.get(state);
    }

    //코인넣기
    public void insertCoin() {
        currentState.insertCoin();
    }

    //코인반환
    public void ejectCoin() {
        currentState.ejectCoin();
    }

    //손잡이 돌리기
    public void turnCrank() {
        currentState.turnCrank();
    }

    //알맹이 내보내기
    public void dispense() {
        currentState.dispense();
    }


    public void releaseBall() {
        this.ballCount--;
    }

    @Override
    public String toString() {
        return String.format("GumballMachine[state:%s][ballCount=%d]",
            currentState.state(), ballCount);
    }

}
