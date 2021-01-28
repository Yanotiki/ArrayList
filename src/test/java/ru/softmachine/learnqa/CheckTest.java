package ru.softmachine.learnqa; //ваш пакет

import org.junit.jupiter.api.Assertions; //обратите внимание на пакет
import org.junit.jupiter.api.Test;

public class CheckTest {

    @Test //тестовая аннотация, обозначает что этот метод является самостоятельным тестом
    public void checkTest(){
          //проверка утверждений,
          //второй
        /*
         org.junit.jupiter.api.Assertions - класс с методами проверки утверждений
         assertEquals - метод проверяющий эквивалетность 2х объектов
         первый аргумент - ожидаемый результат
         второй аргумент - фактический результат (получили из ответа сервера, бд, чего угодно)
         третий аргумент - сообщение, которое будет выведено в случае отрицательной проверки утверждения
         */
        Assertions.assertEquals(4, 2+2, "world crash!");
    }
}
