package kr.co.oreb.dp.chapter09_1.iterator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MenuItem {

    private final String name;

    private final String desc;

    @Override
    public String toString() {
        return name + " - " + desc;
    }

}
