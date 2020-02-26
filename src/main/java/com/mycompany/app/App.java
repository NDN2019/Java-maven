package com.mycompany.app;

public class App
{

    private final String message = "Jenkins Test";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}