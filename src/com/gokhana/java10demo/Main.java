package com.gokhana.java10demo;

import com.gokhana.java10demo.model.Greeting;
import com.gokhana.java10demo.model.Message;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String message = "Hello, Java 10";
        var messageVar = "Hello, Java 10";
        System.out.println(messageVar.getClass().getTypeName()); //  var messageVar is a String
        System.out.println(message.equals(messageVar)); // True
        polymorphismVar(messageVar);
        collectionVar();
        loopVar();
    }

    /**
     * Compile time error String cannot be converted to int
     *
     * @<code> private static void IncompatibleVar(String message) {
     * var i = 10;
     * i = message;
     * System.out.println(i);
     * }
     * </code>
     */


    private static void polymorphismVar(String messageString) {
        var message = new Message();
        message.defaultMessage();
        var greetingMessage = new Greeting();
        // greetingMessage = message; A supertype var cannot be assigned to subtype var.
        message = greetingMessage;
        message.defaultMessage();
    }

    private static void collectionVar() {
        var list = new ArrayList<>(Arrays.asList("First Element", 10));
        String firstString = (String) list.get(0); // need to cast String
        // var firstStringVar = list.get(0);
        // System.out.println(firstStringVar.getClass().getTypeName()); //  var casting the string.

        System.out.println(firstString);

        var date = new Date();
        list.add(date);
        System.out.println(list);
    }


    private static void loopVar() {
        var words = Arrays.asList("pencil", "apple", "pineapple");
        for (var songWord : words) {
            var withSinger = songWord + " -Pikotaro";
            System.out.println(withSinger);
        }

        // Java 8 Stream with var
        var stream = words.stream();
        stream.map(word -> word + " by Pikotaro ")
                .forEach(System.out::print);
    }
}
