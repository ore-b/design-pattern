package kr.co.oreb.dp.chapter09_1.iterator;

import java.util.Iterator;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        printMenu(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
    }

    private void printMenu(Menu... menus) {

        for (Menu menu : menus) {

            Iterator<MenuItem> iterator = menu.createIterator();

            while (iterator.hasNext()) {
                MenuItem menuItem = iterator.next();
                System.out.println(menuItem.toString());
            }
        }


    }

}
