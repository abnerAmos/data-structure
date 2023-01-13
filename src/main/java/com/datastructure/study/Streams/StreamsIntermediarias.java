package com.datastructure.study.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIntermediarias {

    public static void main(String[] args) {

        // Criando uma lista
        List<Integer> list = Arrays.asList(2,3,4,2,5,6,7,3,8,5,9,9,10);

        // Convertendo uma Lista de Array em Stream
        Stream<Integer> st1 = list.stream();

        // Método "map": Transforma dados da Stream sem alterar a lista original.
        Stream<Integer> st2 = list.stream().map(e -> e * 10);

        // Criando direto uma Stream com ".of".
        Stream<String> st3 = Stream.of("Abner", "Juliana", "Anna");

        // Convertendo uma Stream em Lista de Array
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println(Arrays.toString(st3.toArray()));

        // Cria uma Stream de Iteração a partir de um numero.
        Stream<Integer> st4 = Stream.iterate(0, e -> e + 2);

        // Limitando a quantidade de elementos do Array com ".limit"
        System.out.println(Arrays.toString(st4.limit(10).toArray()) + " - limit");

        // Pula a quantidade de elementos do Array com ".skip"
        Stream<Integer> st5 = list.stream();
        System.out.println(Arrays.toString(st5.skip(2).toArray()) + " - skip");

        // Elimina dados repetidos com ".distinct".
        Stream<Integer> st6 = list.stream();
        System.out.println(Arrays.toString(st6.distinct().toArray()) + " - distinct");

        // Transforma os dados sem alterar a lista original com ".map".
        Stream<Integer> st7 = list.stream();
        System.out.println(Arrays.toString(st7.map(e -> e * 2).toArray()) + " - map");

        /* Somando uma lista com ".reduce";
        * Reduce é utilizado para calculos;
        * O numero de identificação "0", é o numero base para inicio de calculo, igual a um "count/contador",
        * Ex.: Se multiplicação, começa com 1  */
        int sum = Stream.of(1,2,3,4,5).reduce(0, (x, y) -> x + y);
        System.out.println(sum + " - reduce");

        List<Integer> list2 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(Arrays.toString(list2.toArray()) + " - filter");

        System.out.println();
        // Extra: Fibonnaci com Stream
        Stream<Long> ste = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(ste.limit(10).toArray()) + " - fibonnaci");



    }


}
