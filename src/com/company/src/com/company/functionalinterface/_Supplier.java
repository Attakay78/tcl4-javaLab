package com.company.functionalinterface;

import java.util.function.Supplier;

//Supplier represents a supplier of results
public class _Supplier {
    public static void main(String[] args) {
//        System.out.println(printName());
        System.out.println(printNameSupplier.get());
    }

    //imperative way
    static String printName(){
        return "richard";
    }

    //Supplier
    static Supplier<String> printNameSupplier = () -> "richard quaicoe";
}
