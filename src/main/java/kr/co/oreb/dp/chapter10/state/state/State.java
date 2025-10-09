package kr.co.oreb.dp.chapter10.state.state;

public interface State {

    StateEnum state();

    //코인넣기
    void insertCoin();

    //코인반환
    void ejectCoin();

    //손잡이 돌리기
    void turnCrank();

    //알맹이 내보내기
    void dispense();

}
