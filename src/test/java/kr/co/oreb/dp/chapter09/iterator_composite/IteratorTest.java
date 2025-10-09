package kr.co.oreb.dp.chapter09.iterator_composite;

import java.util.Iterator;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        printMenu(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
    }

    @SafeVarargs
    private void printMenu(Iterable<MenuItem>... menus) {

        for (Iterable<MenuItem> menu : menus) {

            Iterator<MenuItem> iterator = menu.iterator();

            while (iterator.hasNext()) {
                MenuItem menuItem = iterator.next();
                System.out.println(menuItem.toString());
            }
        }
    }

    @Test
    public void compositeIteratorTest() {
        MenuComponent pancakeHouseMenu = new Menu("팬케이스 하우스 메뉴", "아침메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨보세요!");
        MenuComponent allMenus = new Menu("전체 메뉴", "전체메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dessertMenu.add(new MenuItem("애플파이", "마리나라 소스 스파게티"));
        dessertMenu.add(new MenuItem("아이스크림", "연유첨가 소프트 아이스크림"));

        allMenus.print();

    }

}
