package ywx.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamStudy {

    static void gen1() {
        String[] arr = { "a", "b", "1", "2" };
        Stream<String> stream = Stream.of(arr);
    }

    static void gen2() {
        String[] arr = { "a", "b", "1", "2" };
        Stream<String> stream = Stream.of(arr);
    }

    static void gen3() {
        Stream.generate(() -> 1);
    }

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Test
    public void test1() {
        List<String> listStr = new ArrayList<>();
        Stream<String> stream = listStr.stream();

        Stream<Integer> stream2 = Stream.iterate(0, x -> x + 2);
        stream2.limit(10).forEach(System.out::println);
    }

}
