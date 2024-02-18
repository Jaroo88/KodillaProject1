package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CollectionTestSuiteTest {

    @BeforeEach
    void setUp() {
        System.out.println("Start Test");
    }

    @AfterEach
    void tearDown() {

        System.out.println("Finish Test");
    }

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> library = new ArrayList<>();


        //when

        List<Integer> numbersList = oddNumbersExterminator.exterminate(library);

        //then

        Assertions.assertEquals(List.of(),numbersList);

    }
    @Test
    void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> library = new ArrayList<>();
        library.add(1);
        library.add(2);
        library.add(3);
        library.add(4);
        library.add(5);

        List<Integer> numbersList = oddNumbersExterminator.exterminate(library);

        Assertions.assertEquals(List.of(2, 4), numbersList);
    }
}
