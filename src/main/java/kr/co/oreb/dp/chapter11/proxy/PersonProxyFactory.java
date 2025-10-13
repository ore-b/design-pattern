package kr.co.oreb.dp.chapter11.proxy;

import java.lang.reflect.Proxy;

public class PersonProxyFactory {

    public static Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
    }

    public static Person getOtherProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OtherInvocationHandler(person));
    }

}
