package com.datastructure.study.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFinais {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,2,5,6,7,3,8,5,9,9,10);

        // Contando a quantidade de elementos com ".count"
        Long count = list.stream().distinct().count();
        System.out.println(count + " - .count");

        // Retornando o menor numero da lista com ".min".
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        System.out.println(min.get() + " - .min");

        // Retornando o maior numero da lista com ".max".
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println(max.get() + " - .max");

        // Transforma o stream em uma lista com ".collect".
        List<Integer> newList = list.stream().distinct().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(newList + " - .collect...toList");

        // Transforma o stream em uma lista concatenada e com divisão delimitada "-" com ".collect...joining".
        String collect = list.stream().map(String::valueOf).collect(Collectors.joining(" - "));
        System.out.println(collect + " - .collect...joining");
    }
}
