package org.example;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) ->
    {
        if (y != 0) {
            return x / y;
        } else {
            System.out.print("Нельзя делить на ноль! ");
            return 0;
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Predicate<Integer> isZero = x -> x == 0;
    Consumer<Integer> println = System.out::println;

}
