package com.app;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        int num1 = -10;
        int num2 = 10;

        String s1 = "Teste com optionals";
	    Optional<String> optional1 = Optional.of(s1);

        System.out.println(optional1);
        String s2 = converteNegativoEmString(num1).orElse("");
        System.out.println("NUM 1: " + s2);

        s2 = converteNegativoEmString(num2).orElseGet(() -> "");
        System.out.println("NUM 2: " + s2);
    }

    public static Optional<String> converteNegativoEmString(int numero) {
        if(numero < 0) {
            return Optional.of(String.valueOf(numero));
        } else {
            return Optional.empty();
        }
    }
}
