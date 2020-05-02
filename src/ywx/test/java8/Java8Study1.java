package ywx.test.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class Java8Study1 {

    public String get() {
        return "hello";
    }

    public String get1(String str) {
        return str+":hello";
    }

    @Test
    public void test1() {
        Supplier<String> s1 = () -> {return new Java8Study1().get();};
        Supplier<String> s2 = () -> new Java8Study1().get();
        Supplier<String> s3 = new Java8Study1()::get;
        System.out.println(s3.get());

        Function<String,String> uo = x -> new Java8Study1().get1(x);
        Function<String,String> f = new Java8Study1()::get1;
        String str1 = f.apply("wenmei");
        System.out.println(str1);

    }

    @Test
    public void test2() {
        try {
            Files.lines(Paths.get("D:\\java\\workspace\\Java8Study\\src\\ywx\\test\\java8\\StreamStudy.java")).forEach(System.out::println);
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        String[] arr = {"a","b","1","2"};
        Stream<String> str =Stream.of(arr);
        str.forEach(System.out::println);
    }

    @Test
    public void test4(){
        List<String> strList = Arrays.asList("a","b","1","2");
        Stream<String> str = strList.stream();
        str.forEach(System.out::println);
    }

    @Test
    public void test5() {
        Stream<Integer> str = Stream.generate(()->1);
        str.limit(3).forEach(System.out::println);
    }

    @Test
    public void test6() {
        Stream.iterate(1, x->x+1)
        .limit(6)
        .forEach(System.out::println);
    }

    @Test
    public void test7() {
        Arrays.asList(1,2,3,4,5).stream().filter(x -> x%2==0).forEach(System.out::println);
    }

}
