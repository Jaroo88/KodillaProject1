package com.kodilla.stream.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMirrorTest {

    @Test
    void mirror() {
        //Given
        String name = "Adam";
        String reverseName = "madA";


        //When
        String reversed = new StringBuilder(name).reverse().toString();
        //Then
        assertEquals(reverseName, reversed);

    }
}