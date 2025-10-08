package kr.co.oreb.dp.chapter09_1.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    private final Hashtable items;

    public CafeMenu() {
        items = new Hashtable();
        addMenu("베지 버거와 에어프라이", "통밀빵, 상추,토마토, 감자튀김이 첨가된 베지버거");
        addMenu("오늘의 스프", "샐러드가 곁들여진 오늘의 스프");
    }

    private void addMenu(String name, String desc) {
        items.put(name, new MenuItem(name, desc));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return items.values().iterator();
    }
}
