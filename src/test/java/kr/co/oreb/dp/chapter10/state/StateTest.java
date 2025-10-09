package kr.co.oreb.dp.chapter10.state;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void stateTest() {
        GumballMachine machine = new GumballMachine();

        machine.insertCoin();
        machine.turnCrank();

        System.out.println(machine);
        System.out.println("==============");

        machine.insertCoin();
        machine.ejectCoin();
        machine.turnCrank();

        System.out.println(machine);
        System.out.println("==============");

        machine.insertCoin();
        machine.turnCrank();
        System.out.println(machine);
        System.out.println("==============");

        machine.insertCoin();
        machine.turnCrank();
        machine.turnCrank();
        System.out.println(machine);
        System.out.println("==============");

        machine.insertCoin();
        machine.turnCrank();
        System.out.println(machine);
        System.out.println("==============");


    }

}

