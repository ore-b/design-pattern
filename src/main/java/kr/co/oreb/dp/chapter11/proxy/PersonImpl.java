package kr.co.oreb.dp.chapter11.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonImpl implements Person {

    //본인만 수정 할 수 있는 변수
    private String name;

    private int age;

    //다른사람이 수정 할 수 있는 변수
    private int score;
    

    public void evaluate(int score) {
        this.score += score;
    }

}
