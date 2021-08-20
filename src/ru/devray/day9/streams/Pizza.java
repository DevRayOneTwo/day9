package ru.devray.day9.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pizza {

    public PizzaSort name;
    public List<PizzaComponents> pizzaComponents;
    public int weightInGramms;
    public boolean isVegetarian;

    public Pizza(PizzaSort name, List<PizzaComponents> pizzaComponents, int weightInGramms, boolean isVegetarian) {
        this.name = name;
        this.pizzaComponents = pizzaComponents;
        this.weightInGramms = weightInGramms;
        this.isVegetarian = isVegetarian;
    }

    public static List<Pizza> generatePizzas(int count){
        Random random = new Random();

        List<Pizza> pizzas = new ArrayList<>();

        //генерируем заданное количество пицц и добавляем их в список
        for (int i = 0; i < count; i++){
            pizzas.add(
                    new Pizza(
                            PizzaSort.values()[random.nextInt(PizzaSort.values().length)],
                            generateComponents(),
                            random.nextInt(1300),
                            random.nextBoolean())
            );
        }
        return pizzas;
    }

    private static List<PizzaComponents> generateComponents(){
        Random random = new Random();

        List<PizzaComponents> components = new ArrayList<>();
        for (int i = 0; i < random.nextInt(9) + 1; i++) {
            components.add(PizzaComponents.values()[random.nextInt(PizzaComponents.values().length)]);
        }

        return components;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name=" + name +
                ", pizzaComponents=" + pizzaComponents +
                ", weightInGramms=" + weightInGramms +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}
