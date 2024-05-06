package com.kodilla.stream.exercise;

public class StringMirror {
    public String mirror(String text) {
        StringBuilder reversedText = new StringBuilder(text);
        return reversedText.reverse().toString();
    }


}
