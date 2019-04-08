package ru.geekbrains.lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {
    static Scanner scan = new Scanner(System.in);
    static HashMap<String, HashSet<String>> phoneBook = new HashMap<>();
    static int actionChoice = 0;

    public static void main(String[] args) {
        while (actionChoice != 3) {
            System.out.println("1: Ввод информации в справочник");
            System.out.println("2: Поиск телефона по фамилии");
            System.out.println("3: Завершение работы");
            try {
                actionChoice = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода: " + ex);
            }
            scan.nextLine();

            if (actionChoice == 1) {
                PhoneBook.add(); // Добавление записи
            }

            if (actionChoice == 2) {
                PhoneBook.get(); // Вывод записи
            }
        }

    }

    public static void get() {
        System.out.println("Введите фамилию");
        String familyName = scan.nextLine();
        try {
            System.out.println(String.format("Телефоны для фамилии '%s': %s", familyName, phoneBook.get(familyName).toString()));
        } catch (NullPointerException ex) {
            System.out.println("Нет такой фамилии!");
        }
    }

    public static void add() {
        HashSet<String> temporalHashSet = new HashSet<>();
        System.out.println("Введите фамилию");
        String familyName = scan.nextLine();
        System.out.println("Введите телефон");
        String phoneNumber = scan.nextLine();

        if (phoneBook.containsKey(familyName)) {
            temporalHashSet = phoneBook.get(familyName);
            temporalHashSet.add(phoneNumber);
            phoneBook.put(familyName, temporalHashSet);
        } else {
            temporalHashSet.add(phoneNumber);
            phoneBook.put(familyName, temporalHashSet);
        }

    }
}
