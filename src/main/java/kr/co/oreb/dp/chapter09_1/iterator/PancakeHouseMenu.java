package kr.co.oreb.dp.chapter09_1.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {

    private final ArrayList<MenuItem> items;

    public PancakeHouseMenu() {
        items = new ArrayList<>();
        items.add(new MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 펜케이크"));
        items.add(new MenuItem("레귤러 팬케이크 세트", "달걀과 소시지가 곁들여진 펜케이크"));
        items.add(new MenuItem("블루베리 팬케이크 세트", "신선한 블루베리와 시럽으로 펜케이크"));
    }

    @Override
    public PancakeHouseMenuIterator createIterator() {
        return new PancakeHouseMenuIterator(items);
    }
}
