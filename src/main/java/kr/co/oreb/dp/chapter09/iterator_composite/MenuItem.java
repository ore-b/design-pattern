package kr.co.oreb.dp.chapter09.iterator_composite;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MenuItem extends MenuComponent {

    private final String name;

    private final String desc;

    @Override
    public String toString() {
        return name + " - " + desc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
