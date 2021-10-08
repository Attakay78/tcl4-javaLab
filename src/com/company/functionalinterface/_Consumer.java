package com.company.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer takes one or two arguments and returns nothing
public class _Consumer {
    public static void main(String[] args) {
//        greeting(new Customer("richard", "45683"));
//        greetingConsumer.accept(new Customer("richard", "7336789"));
        greetingBiConsumer.accept(new Customer("abigail", "456384678"), true);
    }

    //Biconsumer way
    static BiConsumer<Customer, Boolean> greetingBiConsumer = (customer, showNumber) -> {
        System.out.println("the biconsumer info is as follows "+ customer.name+" "+(showNumber? customer.phoneNumber: "*********"));
    };

    //consumer way
    static Consumer<Customer> greetingConsumer = customer -> System.out.println(customer.name + " " + customer.phoneNumber);

    //imperative way
    static void greeting(Customer customer){
        System.out.println(customer.name+ " " + customer.phoneNumber);
    }

    static class Customer{
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
