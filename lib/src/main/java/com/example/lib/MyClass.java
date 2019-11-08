package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Servitor servitor = new Servitor();
        servitor.setServitorNumber();
        servitor.setAllVariable();
        servitor.calc();
    }
}
