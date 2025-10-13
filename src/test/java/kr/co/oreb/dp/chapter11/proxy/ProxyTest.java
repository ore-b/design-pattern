package kr.co.oreb.dp.chapter11.proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void testProxy() {

        Person person = new PersonImpl("AAA", 30, 0);

        Person ownerProxy = PersonProxyFactory.getOwnerProxy(person);
        ownerProxy.setName("BBB");
        ownerProxy.setAge(40);
        try {
            ownerProxy.evaluate(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Person otherProxy = PersonProxyFactory.getOtherProxy(person);

        otherProxy.evaluate(100);

        try {
            otherProxy.setAge(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            otherProxy.setName("CCC");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
