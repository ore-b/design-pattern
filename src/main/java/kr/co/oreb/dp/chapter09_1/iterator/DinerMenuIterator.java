package kr.co.oreb.dp.chapter09_1.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] items;

    private int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        if (items.length <= position) {
            return false;
        }

        if (items[position] == null) {
            return false;
        }

        return true;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
