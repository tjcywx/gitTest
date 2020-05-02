package ywx.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Java8Study2 {

    @Test
    public void test1() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        r.run();
        System.out.println("=========================");

        Runnable r1 = () -> System.out.println("hello Lambda");
        r1.run();
    }

    @Test
    public void test2() {
        List<Employee> emps = Arrays.asList(
                new Employee(101, "张三", 18, 9999.99),
                new Employee(102, "李四", 59, 6666.66),
                new Employee(103, "王五", 28, 3333.33),
                new Employee(104, "赵六", 8, 7777.77),
                new Employee(105, "田七", 38, 5555.55));

        Collections.sort(emps, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return -Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}
