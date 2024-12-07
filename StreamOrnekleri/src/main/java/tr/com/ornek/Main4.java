package tr.com.ornek;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        int[] sayilar = {1,3,5,2};
        Arrays.stream(sayilar).flatMap(s-> IntStream.of(s*2, s*5)).forEach(System.out::println);
        System.out.println("***************");
        int[] s1 = {2,3};
        int[] s2 = {3,2,5};
        Stream.of(s1, s2).forEach(System.out::println);
        System.out.println("***************");
        Stream.of(s1, s2).flatMapToInt(a-> IntStream.of(a)).forEach(System.out::println);

    }
}
