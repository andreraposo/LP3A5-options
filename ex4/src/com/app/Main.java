package com.app;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> nomes = Stream.of("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
        nomes = nomes.filter(e -> e.charAt(0) == 'W' || e.charAt(0) == 'w');
        Optional<String> res = nomes.findAny();
        res.orElseThrow(() -> new NullPointerException("Nomes com esta letra não consta na lista"));
    }
}
