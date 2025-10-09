package kr.co.oreb.dp.chapter09.iterator_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents;

    private String name;

    private String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
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
        System.out.println("Menu : " + name + " : " + desc);
        System.out.println("-----------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()) {
            MenuComponent menuItem = iterator.next();
            menuItem.print();
        }
    }
}
