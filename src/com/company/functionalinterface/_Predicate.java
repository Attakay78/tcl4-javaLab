package com.company.functionalinterface;

import java.util.function.Predicate;

// Predicate takes in an argument and return a boolean
public class _Predicate {
    public static void main(String[] args) {

//        System.out.println(isPhoneValid("0753425672"));
        System.out.println(isphoneNumber.test("0735273567"));
    }

    //predicate way
    static Predicate<String> isphoneNumber = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    //imperative way
    static boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }
}
