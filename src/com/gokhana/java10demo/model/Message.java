package com.gokhana.java10demo.model;

public class Message {

    private String text;
    private String type;

    public Message() {
    }

    public Message(String text, String type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void defaultMessage(){
        System.out.println(new Message("Hello","Default"));
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

