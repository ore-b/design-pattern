package kr.co.oreb.dp.chapter09_1.iterator;

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

}
