package ru.devray.day9;

import ru.devray.day9.funcinterf.Executable;
import ru.devray.day9.streams.Pizza;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pizza> pizzas = Pizza.generatePizzas(10);
//        for (Pizza p : pizzas){
//            if (p.isVegetarian) {
//                System.out.println(p);
//            }
//        }

        pizzas.stream()
                .filter(p -> p.weightInGramms > 500)
                .filter(p -> p.isVegetarian)
                .limit(2)
                .forEach(System.out::println);

        //pizzas.stream().forEach(p -> { if (p.isVegetarian) System.out.println(p);});


    }
}
