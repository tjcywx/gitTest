package ywx.com.test;

import java.lang.reflect.Field;

import org.junit.Test;

import ywx.test.java8.ReflectionTest;

public class JavaTest {

    @Test
    public void test1() throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        ReflectionTest tfpt = new ReflectionTest();
        Field[] fields = tfpt.getClass().getDeclaredFields();
        for(Field field :fields) {
            field.setAccessible(true);
            System.out.println( field.get(tfpt));
        }
    }

    @Test
    public void test2() {
        System.out.println();
    }
}
