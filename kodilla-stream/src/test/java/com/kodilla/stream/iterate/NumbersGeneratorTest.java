package com.kodilla.stream.iterate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersGeneratorTest {

    @Test
    void generateEven() {
        //Given
        List<Integer> numbers = Arrays.asList(2, 4,6, 8, 10);

        //When
        List <Integer> result = NumbersGenerator.generateEven(10);
        //Then
        assertEquals(numbers, result);
    }
@Test
void  generateEvenWhenMaxIsZero() {

        //Given

    List<Integer> emptyList = Collections.emptyList();
        //When
    List <Integer> result = NumbersGenerator.generateEven(0);
        //Then
    assertEquals(emptyList,result);
    }
    @Test
    void generateEvenWhenMinIsMinusTen(){
        //Given
        List<Integer> numbers = Collections.emptyList();
        //When
        List<Integer> result = NumbersGenerator.generateEven(-10);
        //Then
        assertEquals(numbers, result);
    }
}