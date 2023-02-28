package org.example;

import java.util.Scanner;

public class User {
    public static void welcome(String str) {
        User.message(str);
    }

    public static void message(String str) {
        System.out.println(str);
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
