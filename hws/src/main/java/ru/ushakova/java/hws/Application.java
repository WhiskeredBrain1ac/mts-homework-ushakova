package ru.ushakova.java.hws;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Привет, " + name + "!");
    }
}