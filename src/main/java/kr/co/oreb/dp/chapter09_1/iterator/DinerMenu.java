package kr.co.oreb.dp.chapter09_1.iterator;

public class DinerMenu implements Menu {

    private final MenuItem[] items;

    public DinerMenu() {
        this.items = new MenuItem[3];
        items[0] = new MenuItem("채식주의자용 BLT", "식물만 들어간 메뉴");
        items[1] = new MenuItem("BLT", "통밀, 베이컨, 토마토를 얹은 메뉴");
        items[2] = new MenuItem("핫도그", "갖은 양념 양파,치즈가 곁들여진 핫도그");
    }

    @Override
    public DinerMenuIterator createIterator() {
        return new DinerMenuIterator(items);
    }

}

