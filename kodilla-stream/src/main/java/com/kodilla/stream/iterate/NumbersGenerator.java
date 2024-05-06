package com.kodilla.stream.iterate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class NumbersGenerator {
    public static List<Integer> generateEven(int max){
        if (max<0){
            return Collections.emptyList();
        }
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numbers);
        return numbers;

    }
}
