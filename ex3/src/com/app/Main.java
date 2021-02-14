package com.app;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> nomes = Stream.of("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
        nomes = nomes.filter(e -> e.charAt(0) == 'W' || e.charAt(0) == 'w');
        Optional<String> res = nomes.findAny();
        if(res.isPresent())
            System.out.println(res);
        else
            System.out.println("Nomes com esta letra não consta na lista");
    }
}
