package day31_Costructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        // create 100 pizza objectd: size - 'S' , cheese topping-2, pepperonitopping-3
        // create 100 pizza objectd: size - 'M' , cheese topping-3, pepperonitopping-4
        // create 100 pizza objectd: size - 'L' , cheese topping-4, pepperonitopping-5

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('l', 4, 5);
            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));

        }
        System.out.println("total number of pizza: " + pizzas.size());
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("total price of pizzas= " + totalPrice);

    }
}
