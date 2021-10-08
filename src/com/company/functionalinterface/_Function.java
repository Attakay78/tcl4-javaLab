package com.company.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

//Function takes one or two arguments and return a value
public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> add1AndThenMultiply = incrementByOneFunction.andThen(multiplyBy10Function);
        int result = add1AndThenMultiply.apply(2);
        System.out.println(result );

        BiFunction<Integer, Integer, Integer> incrementByFunction = (i, j) -> (i + 1) * j;

        int number = incrementByFunction.apply(1, 10);
        System.out.println(number);

    }

    //Functional way
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    //imperative way
    static int incrementByOne(int number){
        return number + 1;
    }

}
