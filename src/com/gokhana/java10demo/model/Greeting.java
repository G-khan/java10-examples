package com.gokhana.java10demo.model;

public class Greeting extends Message {

    public Greeting() {

    }

    public void defaultMessage() {
        System.out.println(new Message("Greetings from me", "Greetings"));
    }


}
