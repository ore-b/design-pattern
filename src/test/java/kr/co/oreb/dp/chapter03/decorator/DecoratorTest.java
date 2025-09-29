package kr.co.oreb.dp.chapter03.decorator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import kr.co.oreb.dp.chapter03.decorator.starbug.beverage.Beverage;
import kr.co.oreb.dp.chapter03.decorator.starbug.beverage.DarkRost;
import kr.co.oreb.dp.chapter03.decorator.starbug.beverage.Espresso;
import kr.co.oreb.dp.chapter03.decorator.starbug.beverage.HouseBlend;
import kr.co.oreb.dp.chapter03.decorator.starbug.decorator.Mocha;
import kr.co.oreb.dp.chapter03.decorator.starbug.decorator.Soy;
import kr.co.oreb.dp.chapter03.decorator.starbug.decorator.Whip;
import kr.co.oreb.dp.chapter03.decorator.stream.LowerCaseInputStream;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void decorator() {
        Beverage espresso = new Espresso(1);
        System.out.println(
            espresso.getDesc() + ", size:" + espresso.size() + ", cost:" + espresso.cost() + " 원");

        Beverage darkRost = new DarkRost(2);
        darkRost = new Mocha(darkRost);
        darkRost = new Whip(darkRost);
        darkRost = new Soy(darkRost);

        System.out.println(
            darkRost.getDesc() + ", size:" + darkRost.size() + ", cost:" + darkRost.cost() + " 원");

        Beverage hoseBlend = new HouseBlend(3);
        hoseBlend = new Mocha(hoseBlend);
        hoseBlend = new Whip(hoseBlend);
        hoseBlend = new Soy(hoseBlend);

        System.out.println(
            hoseBlend.getDesc() + ", size:" + hoseBlend.size() + ", cost:" + hoseBlend.cost()
                + " 원");
    }


    @Test
    @SneakyThrows
    void inputStreamTest() {
        String value = "HELLO WORLD";

        InputStream inputStream = new ByteArrayInputStream(value.getBytes());

        try (InputStream lower = new LowerCaseInputStream(inputStream)) {
            byte[] buf = lower.readAllBytes();
            System.out.print(new String(buf, StandardCharsets.UTF_8));
        }
    }

}
