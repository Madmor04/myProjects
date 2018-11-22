package com.company;

public class Main {

    public static void main(String[] args) throws Exception{
        Main main = new Main();
        main.method(1);
    }

    <T> T method (T type){
        System.out.println(type);
        return type;
    }
}
