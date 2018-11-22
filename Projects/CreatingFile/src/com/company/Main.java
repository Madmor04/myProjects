package com.company;

import java.io.*;

public class Main {

    public static void input(String[][] mas, String a){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mas[i][j] = a;
            }
        }
    }

    public static void output(String[][] mas) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        String[][] Yellow = new String[3][3];
        String[][] Blue = new String[3][3];
        String[][] Red = new String[3][3];
        String[][] White = new String[3][3];
        String[][] Orange = new String[3][3];
        String[][] Green = new String[3][3];
        String Y = "Y";
        String B = "B";
        String R = "R";
        String W = "W";
        String O = "O";
        String G = "G";
        input(Yellow, Y);
        output(Yellow);
        System.out.println();
        input(Blue, B);
        output(Blue);
        System.out.println();
        input(Red, R);
        output(Red);
        System.out.println();
        input(White, W);
        output(White);
        System.out.println();
        input(Orange, O);
        output(Orange);
        System.out.println();
        input(Green, G);
        output(Green);
    }
}
