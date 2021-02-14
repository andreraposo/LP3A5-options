package com.options;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -10;

        String s = convertePositivoEmString(num1).orElse("");
        System.out.println("NUM 1: " + s);

        s = convertePositivoEmString(num2).orElseGet(() -> "");
        System.out.println("NUM 2: " + s);
    }

    public static Optional<String> convertePositivoEmString(int numero) {
        if(numero > 0) {
            return Optional.of(String.valueOf(numero));
        } else {
            return Optional.empty();
        }
    }
}
