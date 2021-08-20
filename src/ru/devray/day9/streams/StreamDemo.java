package ru.devray.day9.streams;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Pizza> pizzas = Pizza.generatePizzas(10);


        //for-each cycle
        //Pizza[] arrayPizzas = (Pizza[]) pizzas.stream().filter(p -> p.isVegetarian).toArray();

//        List<Pizza> vegeterianPizzas = pizzas.stream().filter(p -> p.isVegetarian).collect(Collectors.toList());
//
//        System.out.println(vegeterianPizzas.stream().filter(p -> p.pizzaComponents.size() > 2).count());
//
//        System.out.println(vegeterianPizzas);

        String s = "sdagfgfdh";
        List.of(s.toCharArray()).stream().forEach(c-> System.out.println(c + "1"));

        List<String> strings = List.of("sdfdf","34234", "fdsf45454", "34", "sdfdfsdfffds", "", "3342dffd");

        Stream<BoxNumber> boxes1 = strings.stream()
                .filter(s1 -> s1.matches("\\d+")).limit(1)
                .map((s1) -> Integer.parseInt(s1))
                .map(i -> new BoxNumber(i));

//        System.out.println("result:"+boxes1);
//        System.out.println(pizzas.stream().noneMatch(p -> p.pizzaComponents.size() > 6 ));

        //IntStream DoubleStream LongStream

        Stream<BoxNumber> boxes2 = IntStream.range(2,10).mapToObj(i -> new BoxNumber(i));

        System.out.println(boxes2);
        //Stream.concat(boxes1, boxes2).forEach(System.out::println);





    }
}
