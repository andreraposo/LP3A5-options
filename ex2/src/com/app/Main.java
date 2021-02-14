package com.app;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Optional com Valor");

        System.out.println(o2.orElseThrow(() -> new NullPointerException("valor vazio.")));
        System.out.println(o1.orElseThrow(() -> new NullPointerException("valor vazio.")));
    }
}
